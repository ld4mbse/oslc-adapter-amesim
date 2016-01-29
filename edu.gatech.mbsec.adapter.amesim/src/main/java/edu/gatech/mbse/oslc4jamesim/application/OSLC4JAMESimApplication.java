
package edu.gatech.mbse.oslc4jamesim.application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;




















import edu.gatech.mbsec.adapter.subversion.SubversionFile;
import edu.gatech.mbsec.adapter.subversion.SubversionFileService;
import edu.gatech.mbsec.adapter.subversion.SubversionManager;
import org.eclipse.lyo.oslc4j.application.OslcWinkApplication;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;
import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;



















import org.eclipse.lyo.oslc4j.provider.json4j.Json4JProvidersRegistry;

import com.opencsv.CSVReader;

import util.FileMetadata;
import clients.SubversionClient;
import clients.SubversionFileClient;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimCircuit;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimComponent;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimGlobalParameter;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimLine;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimParameter;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimPort;
import edu.gatech.mbsec.adapter.amesim.resources.Constants;
import edu.gatech.mbse.oslc4jamesim.services.AMESimCircuitService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimComponentService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimGlobalParameterService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimLineService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimParameterService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimPortService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimSVNFileURLService;
import edu.gatech.mbse.oslc4jamesim.services.RDFVocabularyService;
import edu.gatech.mbse.oslc4jamesim.services.ResourceShapeService;
import edu.gatech.mbse.oslc4jamesim.services.ServiceProviderCatalogService;
import edu.gatech.mbse.oslc4jamesim.services.ServiceProviderService;

public class OSLC4JAMESimApplication extends OslcWinkApplication {

	public static String hostName = "localhost";
	public static String contextPath = "oslc4jamesim";

	public static String amesimEcoreLocation = null;
	public static String amesimModelsDirectory = null;
	public static String pythonScriptsDirectory = null;
	public static String portNumber = null;
	public static boolean syncWithSvnRepo = false;
	public static String svnurl = null;

	public static String warConfigFilePath = "../oslc4jamesim configuration/config.properties";
	public static String localConfigFilePath = "oslc4jamesim configuration/config.properties";
	public static String configFilePath = null;
	public static String warSVNURLsFilePath = "../oslc4jamesim configuration/subversionfiles.csv";
	public static String localSVNURLsFilePath = "oslc4jamesim configuration/subversionfiles.csv";
	public static String svnURLsFilePath = null;
	public static ArrayList<String> subversionFileURLs;
	public static SubversionFileClient subversionFileClient;
	public static String svnUserName;
	public static String svnPassword;
	
	public static int delayInSecondsBetweenDataRefresh = 100000;
	public static SubversionManager subversionManager = null;
	public static boolean useIndividualSubversionFiles = false;

	private static final Set<Class<?>> RESOURCE_CLASSES = new HashSet<Class<?>>();
	public static final Map<String, Class<?>> RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP = new HashMap<String, Class<?>>();

	static {
		RESOURCE_CLASSES.addAll(JenaProvidersRegistry.getProviders());
		RESOURCE_CLASSES.addAll(Json4JProvidersRegistry.getProviders());
		RESOURCE_CLASSES.add(ServiceProviderCatalogService.class);
		RESOURCE_CLASSES.add(ServiceProviderService.class);
		RESOURCE_CLASSES.add(AMESimCircuitService.class);
		RESOURCE_CLASSES.add(AMESimComponentService.class);
		RESOURCE_CLASSES.add(AMESimLineService.class);
		RESOURCE_CLASSES.add(AMESimPortService.class);
		RESOURCE_CLASSES.add(AMESimParameterService.class);
		RESOURCE_CLASSES.add(AMESimGlobalParameterService.class);
		RESOURCE_CLASSES.add(SubversionFile.class);
		RESOURCE_CLASSES.add(SubversionFileService.class);
		RESOURCE_CLASSES.add(AMESimSVNFileURLService.class);

		RESOURCE_CLASSES.add(RDFVocabularyService.class);
		RESOURCE_CLASSES.add(ResourceShapeService.class);
		
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(
				Constants.PATH_AMESIM_CIRCUIT, AMESimCircuit.class);
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(
				Constants.PATH_AMESIM_COMPONENT, AMESimComponent.class);
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(
				Constants.PATH_AMESIM_LINE, AMESimLine.class);
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(
				Constants.PATH_AMESIM_PORT, AMESimPort.class);
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(
				Constants.PATH_AMESIM_PARAMETER, AMESimParameter.class);
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(
				Constants.PATH_AMESIM_GLOBALPARAMETER,
				AMESimGlobalParameter.class);
		loadPropertiesFile();
		readDataFirstTime();

		readDataPeriodically();
	}

	public OSLC4JAMESimApplication() throws OslcCoreApplicationException,
			URISyntaxException {
		super(RESOURCE_CLASSES, OslcConstants.PATH_RESOURCE_SHAPES,
				RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP);
	}

	private static void loadPropertiesFile() {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			// loading properties file
			// input = new FileInputStream("./configuration/config.properties");
			input = new FileInputStream(warConfigFilePath); // for war file
			configFilePath = warConfigFilePath;
		} catch (FileNotFoundException e) {
			try {
				input = new FileInputStream(localConfigFilePath);
				configFilePath = localConfigFilePath;
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // for war file
		}

		// load property file content and convert backslashes into forward
		// slashes
		String str;
		if (input != null) {
			try {
				str = readFile(configFilePath, Charset.defaultCharset());
				prop.load(new StringReader(str.replace("\\", "/")));

				// get the property value
				String amesimEcoreLocationFromUser = prop
						.getProperty("amesimEcoreLocation");
				String amesimModelsDirectoryFromUser = prop
						.getProperty("amesimModelsDirectory");
				String pythonScriptsDirectoryFromUser = prop
						.getProperty("pythonScriptsDirectory");
				String syncWithSvnRepoFromUser = prop
						.getProperty("syncWithSvnRepo");
				String delayInSecondsBetweenDataRefreshFromUser = prop.getProperty("delayInSecondsBetweenDataRefresh");
				String useIndividualSubversionFilesFromUser = prop.getProperty("useIndividualSubversionFiles");

				// add trailing slash if missing
				if (!amesimModelsDirectoryFromUser.endsWith("/")) {
					amesimModelsDirectoryFromUser = amesimModelsDirectoryFromUser
							+ "/";
				}
				amesimModelsDirectory = amesimModelsDirectoryFromUser;
				amesimEcoreLocation = amesimEcoreLocationFromUser;
				pythonScriptsDirectory = pythonScriptsDirectoryFromUser;
				portNumber = prop.getProperty("portNumber");
				svnUserName = prop.getProperty("svnUserName");
				svnPassword = prop.getProperty("svnPassword");
				try {
					if (Boolean.parseBoolean(syncWithSvnRepoFromUser)) {
						syncWithSvnRepo = true;
					}
				} catch (Exception e) {

				}
				try {
					if (Boolean.parseBoolean(useIndividualSubversionFilesFromUser)) {
						useIndividualSubversionFiles = true;
						// delete all existing models in directory as they will be populated with new Subversion files
//						new File(OSLC4JSimulinkApplication.simulinkModelsDirectory).delete();	//only works if directory is emtpy
						Path directory = Paths.get(OSLC4JAMESimApplication.amesimModelsDirectory);
						   Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
							   @Override
							   public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
								   Files.delete(file);
								   return FileVisitResult.CONTINUE;
							   }

							   @Override
							   public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
								   Files.delete(dir);
								   return FileVisitResult.CONTINUE;
							   }

						   });
					}
				} catch (Exception e) {

				}
				svnurl = prop.getProperty("svnurl");
				try {
					delayInSecondsBetweenDataRefresh = Integer.parseInt(delayInSecondsBetweenDataRefreshFromUser);
				} catch (Exception e) {

				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}

	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return encoding.decode(ByteBuffer.wrap(encoded)).toString();
	}

	public static void checkoutOrUpdateSVNWorkingCopy() {
		Thread thread = new Thread() {
			public void start() {
				ArrayList<FileMetadata> fileMetaDatas = clients.SubversionClient.syncWorkingCopy(svnurl,
						amesimModelsDirectory, svnUserName, svnPassword);
				// convert fileMetaDatas into OSLC POJOs
				subversionManager.convertFileMetaDataIntoRDFSubversionFileResources(fileMetaDatas);
			}
		};
		thread.start();
		try {
			thread.join();
			System.out.println(
					"Connection with Subversion repository and creation of OSLC Subversion file resources finished.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void readDataFirstTime() {
		Thread thread = new Thread() {
			public void start() {
				subversionManager = new SubversionManager(AMESimManager.baseHTTPURI);
				reloadAMESimModels();								
			}
		};
		thread.start();
		try {
			thread.join();
			System.out.println("AMESimManager files read. Initialization of OSLC AMESimManager adapter finished.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readDataPeriodically() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				reloadAMESimModels();	
			}
		}, delayInSecondsBetweenDataRefresh * 1000,
				delayInSecondsBetweenDataRefresh * 1000);
	}

	private static void loadSVNURLsFile() {
		Properties prop = new Properties();
		InputStream input = null;
	
		try {
			// loading properties file
			// input = new FileInputStream("./configuration/config.properties");
			input = new FileInputStream(warSVNURLsFilePath); // for war file
			svnURLsFilePath = warSVNURLsFilePath;
		} catch (FileNotFoundException e) {
			try {
				input = new FileInputStream(localSVNURLsFilePath);
				svnURLsFilePath = localSVNURLsFilePath;
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // for war file
		}
	
		// load property file content and convert backslashes into forward
		// slashes
		String str;
		if (input != null) {
			try {				
				CSVReader reader2 = new CSVReader(new FileReader(svnURLsFilePath));
				List<String[]> allElements = reader2.readAll();								
				subversionFileURLs = readSVNFileURLs(allElements);									
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
	
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	
			}
		}
	
	}

	public static ArrayList<String> readSVNFileURLs(List<String[]> allElements) {
			List<String> svnurls = new ArrayList<String>();		
			
			for (String[] element : allElements) {
				if ((element.length == 1)) {
					svnurls.add(element[0]);
				}
			}
			
			ArrayList<String> subversionFileURLs = new ArrayList<String>();
	//		for (String subversionFileURL : SubversionFileURLsFromUserArray) {
			for (String subversionFileURL : svnurls) {
				// make sure to delete possible space character
				if (subversionFileURL.startsWith(" ")) {
					subversionFileURL = subversionFileURL.substring(1, subversionFileURL.length());
				}
				if (subversionFileURL.endsWith(" ")) {
					subversionFileURL = subversionFileURL.substring(0, subversionFileURL.length()-1);
				}
				
				try {
					// make sure that URL is valid
					new URL(subversionFileURL);
						
					// make sure that url is not a duplicate							
						if(!subversionFileURLs.contains(subversionFileURL)){
							subversionFileURLs.add(subversionFileURL);
						}
						
					
				} catch (Exception e) {
	
				}
			}
			return subversionFileURLs;
		}

	public static void checkoutOrUpdateSVNFiles() {
		Thread thread = new Thread() {
			public void start() {
				// read all subversion file urls
				loadSVNURLsFile();
	
				
				
				// initialize global list for FileMetaDatas
				ArrayList<FileMetadata> fileMetaDatas = new ArrayList<FileMetadata>();
				
				// for each subversion file url, perform checkout or update
				for (String subversionFileURLString : subversionFileURLs) {
					// create local directory to save subversionFile
					// files belonging to the same subversion repo directory will share the same local directory
					// name directory based on subversionFileURL
					// get repository directory
					String[] repParts = subversionFileURLString.split("/");
					String subversionFileName = repParts[repParts.length - 1];
					
					String subversionFileDirURL = subversionFileURLString.replace(subversionFileName, "");															
					
					String localSubversionFileDir = subversionFileDirURL.replace(":", "");
					localSubversionFileDir = localSubversionFileDir.replace("/", "");
					
					// create a new directory for the working copy of that file
					if(!new File(amesimModelsDirectory + localSubversionFileDir).exists()){
						new File(amesimModelsDirectory + localSubversionFileDir).mkdirs();
					}
					
					// perform checkout or update on Subversion file
					if(subversionFileClient == null){
						subversionFileClient = new SubversionFileClient();
					}
					FileMetadata specificFileMetaData = subversionFileClient.syncFile(subversionFileURLString,
							amesimModelsDirectory + localSubversionFileDir, svnUserName, svnPassword);
					
					// save Subversion file metadata
					fileMetaDatas.add(specificFileMetaData);
				}
				
				
				// convert fileMetaDatas into OSLC POJOs
				subversionManager.convertFileMetaDataIntoRDFSubversionFileResources(fileMetaDatas);
			}
		};
		thread.start();
		try {
			thread.join();
			System.out.println(
					"Connection with Subversion repository and creation of OSLC Subversion file resources finished.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void reloadAMESimModels() {
		if (useIndividualSubversionFiles) {					
			checkoutOrUpdateSVNFiles();
		} else if (syncWithSvnRepo) {
			checkoutOrUpdateSVNWorkingCopy();
		}
		AMESimManager.amesimWorkingDirectory = null; // to reload models
		AMESimManager.loadAMESimWorkingDirectory();	
		
	}
}

