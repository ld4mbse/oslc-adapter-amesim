package edu.gatech.mbse.oslc4jamesim.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.lyo.oslc4j.core.model.Link;

import edu.gatech.mbsec.adapter.amesim.resources.AMESimCircuit;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimComponent;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimElementsToCreate;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimGlobalParameter;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimLine;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimParameter;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimPort;
import amesim.AmesimPackage;
import amesim.Circuit;
import amesim.Component;
import amesim.GlobalParameter;
import amesim.Line;
import amesim.Parameter;
import amesim.Port;
import amesim.WorkingDirectory;

public class AMESimManager {

	static String amesimDirectory = OSLC4JAMESimApplication.amesimModelsDirectory; // "C:/Users/Axel/git/oslc4jamesim/oslc4jamesim/AMESim";
	static String amesimPythonScriptFolder = OSLC4JAMESimApplication.pythonScriptsDirectory; // "C:\\Users\\Axel\\git\\oslc4jamesim\\oslc4jamesim\\python\\";

	static int sessionID = 1;

	// public static Collection<Model> amesimModels = new ArrayList<Model>();
	// public static Collection<Block> amesimComponents = new
	// ArrayList<Block>();
	// static Collection<InputPort> amesimInputPorts = new
	// ArrayList<InputPort>();
	// static Collection<OutputPort> amesimOutputPorts = new
	// ArrayList<OutputPort>();
	// static Collection<Line> amesimLines = new ArrayList<Line>();
	// static Collection<Parameter> amesimParameters = new
	// ArrayList<Parameter>();
	//
	public static List<AMESimCircuit> oslcAMESimCircuits = new ArrayList<AMESimCircuit>();
	public static List<AMESimComponent> oslcAMESimComponents = new ArrayList<AMESimComponent>();
	public static List<AMESimLine> oslcAMESimLines = new ArrayList<AMESimLine>();
	public static List<AMESimPort> oslcAMESimPorts = new ArrayList<AMESimPort>();
	public static List<AMESimParameter> oslcAMESimParameters = new ArrayList<AMESimParameter>();
	public static List<AMESimGlobalParameter> oslcAMESimGlobalParameters = new ArrayList<AMESimGlobalParameter>();

	static Map<String, AMESimCircuit> qNameOslcAMESimCircuitMap = new HashMap<String, AMESimCircuit>();
	static Map<String, AMESimComponent> qNameOslcAMESimComponentMap = new HashMap<String, AMESimComponent>();
	static Map<String, AMESimLine> qNameOslcAMESimLineMap = new HashMap<String, AMESimLine>();
	static Map<String, AMESimPort> qNameOslcAMESimPortMap = new HashMap<String, AMESimPort>();
	static Map<String, AMESimParameter> qNameOslcAMESimParameterMap = new HashMap<String, AMESimParameter>();
	static Map<String, AMESimGlobalParameter> qNameOslcAMESimGlobalParameterMap = new HashMap<String, AMESimGlobalParameter>();

	public static WorkingDirectory amesimWorkingDirectory = null;

	static StringBuffer buffer;

	public static String baseHTTPURI = "http://"
			+ OSLC4JAMESimApplication.hostName + ":"
			+ OSLC4JAMESimApplication.portNumber + "/"
			+ OSLC4JAMESimApplication.contextPath;
	static String projectId;

	public static void main(String[] args) {
		loadAMESimWorkingDirectory();
	}

	public static synchronized void loadAMESimWorkingDirectory() {

		if (amesimWorkingDirectory != null) {
			return;
		}

		Thread thread = new Thread() {
			public void start() {

				oslcAMESimCircuits.clear();
				oslcAMESimComponents.clear();
				oslcAMESimLines.clear();
				oslcAMESimPorts.clear();
				oslcAMESimParameters.clear();
				oslcAMESimGlobalParameters.clear();

				qNameOslcAMESimCircuitMap.clear();
				qNameOslcAMESimComponentMap.clear();
				qNameOslcAMESimPortMap.clear();
				qNameOslcAMESimLineMap.clear();
				qNameOslcAMESimParameterMap.clear();
				qNameOslcAMESimGlobalParameterMap.clear();

				// run python script
				long startTime = System.currentTimeMillis();
				AMESim2XMIThread amesim2XMIThread = new AMESim2XMIThread();
				amesim2XMIThread.start();
				try {
					amesim2XMIThread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				long endTime = System.currentTimeMillis();
				long duration = endTime - startTime;
				System.out.println("OSLC Adapter <-> AMESim Interaction in "
						+ (duration / 1000) + " seconds");

				try {
					// load AMESim XMI file
					Resource ecoreResource = loadEcoreModel(org.eclipse.emf.common.util.URI
							.createFileURI(new File(
									OSLC4JAMESimApplication.pythonScriptsDirectory
											+ "/amesimWorkDir.xmi")
									.getAbsolutePath()));

					// load AMESim working directory
					amesimWorkingDirectory = (WorkingDirectory) EcoreUtil
							.getObjectByType(ecoreResource.getContents(),
									AmesimPackage.eINSTANCE
											.getWorkingDirectory());

					System.out.println(amesimWorkingDirectory.getCircuit());
					EList<Circuit> circuits = AMESimManager.amesimWorkingDirectory
							.getCircuit();
					for (Circuit circuit : circuits) {
						// create OSLC AMESim circuit
						projectId = circuit.getName();
						try {
							AMESimCircuit amesimCircuit = new AMESimCircuit(
									java.net.URI.create(baseHTTPURI
											+ "/services/" + projectId
											+ "/circuit/"
											+ getQualifiedName(circuit, null)));
							amesimCircuit.setName(circuit.getName());
							qNameOslcAMESimCircuitMap.put(
									getQualifiedName(circuit, null),
									amesimCircuit);
							oslcAMESimCircuits.add(amesimCircuit);

							// map circuit global parameters
							Link[] globalParameterLinks = getLinkedEReferences(circuit
									.getGlobalParameter());
							amesimCircuit
									.setGlobalParameters(globalParameterLinks);

							// map circuit components (but not all nested
							// components)
							EList<Component> components = circuit
									.getComponent();
							Collection<Component> circuitComponents = new ArrayList();
							for (Component circuitComponent : components) {
								String circuitComponentName = getQualifiedName(
										circuitComponent, new StringBuffer());
								if (!circuitComponentName.contains(".")) {
									circuitComponents.add(circuitComponent);
								}
							}
							Link[] componentLinks = getLinkedEReferences(circuitComponents);
							amesimCircuit.setComponents(componentLinks);

							// map circuit lines (but not all nested lines)
							EList<Line> lines = circuit.getLine();
							Collection<Line> circuitLines = new ArrayList();
							for (Line circuitLine : lines) {
								String circuitLineName = getQualifiedName(
										circuitLine, new StringBuffer());
								if (!circuitLineName.contains(".")) {
									circuitLines.add(circuitLine);
								}
							}
							Link[] linesLinks = getLinkedEReferences(circuitLines);
							amesimCircuit.setLines(linesLinks);

						} catch (URISyntaxException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						EList<GlobalParameter> globalParameters = circuit
								.getGlobalParameter();
						for (GlobalParameter globalParameter : globalParameters) {
							// create OSLC AMESim global parameter
							try {

								AMESimGlobalParameter amesimGlobalParameter = new AMESimGlobalParameter(
										java.net.URI.create(baseHTTPURI
												+ "/services/"
												+ circuit.getName()
												+ "/globalparameters/"
												+ getQualifiedName(
														globalParameter, null)));
								amesimGlobalParameter
										.setUniqueName(globalParameter
												.getUniqueName());

								amesimGlobalParameter.setTitle(globalParameter
										.getTitle());
								if (globalParameter.getValue() != null) {
									amesimGlobalParameter
											.setValue(globalParameter
													.getValue());
								}
								amesimGlobalParameter.setUnit(globalParameter
										.getUnit());
								qNameOslcAMESimGlobalParameterMap.put(
										circuit.getName()
												+ "/globalparameters/"
												+ getQualifiedName(
														globalParameter, null),
										amesimGlobalParameter);
								oslcAMESimGlobalParameters
										.add(amesimGlobalParameter);
							} catch (URISyntaxException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

						EList<Component> components = circuit.getComponent();
						EList<Line> lines = circuit.getLine();
						for (Component component : components) {
							// create OSLC AMESim component
							try {
								AMESimComponent amesimComponent = new AMESimComponent(
										java.net.URI.create(baseHTTPURI
												+ "/services/"
												+ circuit.getName()
												+ "/components/"
												+ getQualifiedName(component,
														null)));
								String blockQName = component.getName();
								String blockName = blockQName.split("/")[blockQName
										.split("/").length - 1];
								amesimComponent.setName(blockName);
								qNameOslcAMESimComponentMap.put(
										circuit.getName()
												+ "/components/"
												+ getQualifiedName(component,
														null), amesimComponent);
								oslcAMESimComponents.add(amesimComponent);

								// component attributes
								amesimComponent.setSubModelName(component
										.getSubModelName());
								amesimComponent
										.setSubModelInstanceNumber(component
												.getSubModelInstanceNumber());
								amesimComponent.setSubModelDirectory(component
										.getSubModelDirectory());
								amesimComponent.setCategoryName(component
										.getCategoryName());

								// component parameters
								Link[] parameters = getLinkedEReferences(component
										.getParameter());
								amesimComponent.setParameters(parameters);

								// component ports
								Link[] portLinks = getLinkedEReferences(component
										.getPort());
								amesimComponent.setPorts(portLinks);

								// nested components and lines
								// go through all components, if their uri
								// contains
								// the uri of the supercomponent, then they are
								// nested components
								Collection<Component> nestedComponents = new ArrayList<Component>();
								for (Component circuitComponent : components) {
									if (circuitComponent.getName().startsWith(
											component.getName() + ".")) {
										// test that component does not belong
										// to
										// other nested level
										String circuitComponentName = circuitComponent
												.getName().replace(
														component.getName()
																+ ".", "");
										if (!circuitComponentName.contains(".")) {
											// nested component found
											nestedComponents
													.add(circuitComponent);
										}
									}
								}
								if (nestedComponents.size() > 0) {
									Link[] nestedComponentsLinks = getLinkedEReferences(nestedComponents);
									amesimComponent
											.setNestedComponents(nestedComponentsLinks);
								}
								Collection<Line> nestedLines = new ArrayList<Line>();
								for (Line circuitLine : lines) {
									if (circuitLine.getName().startsWith(
											component.getName() + ".")) {
										// test that line does not belong to
										// other
										// nested level
										String circuitLineName = circuitLine
												.getName().replace(
														component.getName()
																+ ".", "");
										if (!circuitLineName.contains(".")) {
											// nested line found
											nestedLines.add(circuitLine);
										}
									}
								}
								if (nestedLines.size() > 0) {
									Link[] nestedLinesLinks = getLinkedEReferences(nestedLines);
									amesimComponent
											.setNestedLines(nestedLinesLinks);
								}

							} catch (URISyntaxException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							EList<Parameter> componentParameters = component
									.getParameter();
							for (Parameter parameter : componentParameters) {
								System.out.println("\t\tPARAMETER "
										+ parameter.getTitle());

								// create OSLC AMESim component parameter
								try {
									AMESimParameter amesimParameter = new AMESimParameter(
											java.net.URI.create(baseHTTPURI
													+ "/services/"
													+ circuit.getName()
													+ "/parameters/"
													+ getQualifiedName(
															parameter, null)));
									amesimParameter.setTitle(parameter
											.getTitle());
									amesimParameter.setValue(parameter
											.getValue());
									amesimParameter.setDataPath(parameter
											.getDataPath());
									amesimParameter
											.setUnit(parameter.getUnit());
									qNameOslcAMESimParameterMap.put(
											circuit.getName()
													+ "/parameters/"
													+ getQualifiedName(
															parameter, null),
											amesimParameter);
									oslcAMESimParameters.add(amesimParameter);
								} catch (URISyntaxException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}

							EList<Port> componentPorts = component.getPort();
							for (Port port : componentPorts) {
								System.out.println("\t\tPORT " + port.getId());

								// create OSLC AMESim port
								try {
									AMESimPort amesimPort = new AMESimPort(
											java.net.URI.create(baseHTTPURI
													+ "/services/"
													+ circuit.getName()
													+ "/ports/"
													+ getQualifiedName(port,
															null)));
									amesimPort.setId(port.getId());
									amesimPort.setType(port.getType());
									qNameOslcAMESimPortMap.put(
											circuit.getName()
													+ "/ports/"
													+ getQualifiedName(port,
															null), amesimPort);
									oslcAMESimPorts.add(amesimPort);
								} catch (URISyntaxException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}

						}

						for (Line line : lines) {
							// create OSLC AMESim component
							try {
								AMESimLine amesimLine = new AMESimLine(
										java.net.URI.create(baseHTTPURI
												+ "/services/"
												+ circuit.getName() + "/lines/"
												+ getQualifiedName(line, null)));
								String blockQName = line.getName();
								String blockName = blockQName.split("/")[blockQName
										.split("/").length - 1];
								amesimLine.setName(blockName);
								qNameOslcAMESimLineMap.put(
										circuit.getName() + "/lines/"
												+ getQualifiedName(line, null),
										amesimLine);
								oslcAMESimLines.add(amesimLine);

								// line attributes
								amesimLine.setSubModelName(line
										.getSubModelName());
								amesimLine.setSubModelInstanceNumber(line
										.getSubModelInstanceNumber());
								amesimLine.setSubModelDirectory(line
										.getSubModelDirectory());
							} catch (URISyntaxException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

					}
				} catch (Exception e) {
					// ecoreResource may not have been created because there is
					// no Subversion file to load
				}
			}
		};
		thread.start();
		try {
			thread.join();
			System.out.println("Data read from "
					+ OSLC4JAMESimApplication.amesimModelsDirectory
					+ " and converted into OSLC resources at "
					+ new Date().toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Resource loadEcoreModel(
			org.eclipse.emf.common.util.URI fileURI) {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
		AmesimPackage amesimEPackage = AmesimPackage.eINSTANCE;

		resourceSet.getPackageRegistry().put("amesim", amesimEPackage);

		// Demand load the resource for this file.
		Resource resource = resourceSet.getResource(fileURI, true);
		return resource;
	}

	public static AMESimCircuit getCircuitByName(String modelName) {
		return qNameOslcAMESimCircuitMap.get(modelName);
	}

	public static AMESimComponent getComponentByURI(String uri) {
		return qNameOslcAMESimComponentMap.get(uri);
	}

	public static AMESimLine getLineByURI(String uri) {
		return qNameOslcAMESimLineMap.get(uri);
	}

	public static AMESimPort getPortByURI(String uri) {
		return qNameOslcAMESimPortMap.get(uri);
	}

	public static AMESimParameter getParameterByURI(String uri) {
		return qNameOslcAMESimParameterMap.get(uri);
	}

	public static AMESimGlobalParameter getGlobalParameterByURI(String uri) {
		return qNameOslcAMESimGlobalParameterMap.get(uri);
	}

	public static List<AMESimComponent> getComponentsInModel(String modelName) {
		ArrayList<AMESimComponent> elements = new ArrayList<AMESimComponent>();
		for (AMESimComponent aMESimComponent : oslcAMESimComponents) {
			String componentURI = aMESimComponent.getAbout().toString();
			if (componentURI.startsWith(baseHTTPURI + "/services/" + modelName
					+ "/components/")) {
				elements.add(aMESimComponent);
			}
		}
		return elements;
	}

	public static List<AMESimLine> getLinesInModel(String modelName) {
		ArrayList<AMESimLine> elements = new ArrayList<AMESimLine>();
		for (AMESimLine aMESimElement : oslcAMESimLines) {
			String elementURI = aMESimElement.getAbout().toString();
			if (elementURI.startsWith(baseHTTPURI + "/services/" + modelName
					+ "/lines/")) {
				elements.add(aMESimElement);
			}
		}
		return elements;
	}

	public static List<AMESimPort> getPortsInModel(String modelName) {
		ArrayList<AMESimPort> elements = new ArrayList<AMESimPort>();
		for (AMESimPort aMESimElement : oslcAMESimPorts) {
			String elementURI = aMESimElement.getAbout().toString();
			if (elementURI.startsWith(baseHTTPURI + "/services/" + modelName
					+ "/ports/")) {
				elements.add(aMESimElement);
			}
		}
		return elements;
	}

	public static List<AMESimParameter> getParametersInModel(String modelName) {
		ArrayList<AMESimParameter> elements = new ArrayList<AMESimParameter>();
		for (AMESimParameter aMESimElement : oslcAMESimParameters) {
			String elementURI = aMESimElement.getAbout().toString();
			if (elementURI.startsWith(baseHTTPURI + "/services/" + modelName
					+ "/parameters/")) {
				elements.add(aMESimElement);
			}
		}
		return elements;
	}

	public static List<AMESimGlobalParameter> getGlobalParametersInModel(
			String modelName) {
		ArrayList<AMESimGlobalParameter> elements = new ArrayList<AMESimGlobalParameter>();
		for (AMESimGlobalParameter aMESimElement : oslcAMESimGlobalParameters) {
			String elementURI = aMESimElement.getAbout().toString();
			if (elementURI.startsWith(baseHTTPURI + "/services/" + modelName
					+ "/globalparameters/")) {
				elements.add(aMESimElement);
			}
		}
		return elements;
	}

	public static void createAMESimComponent(AMESimComponent amesimComponent,
			String modelName) {
		String amesimDirectory = AMESimManager.amesimDirectory;
		String amesimComponentIconName = amesimComponent.getIconName();
		String amesimComponentAlias = amesimComponent.getName();
		String amesimXCoordinate = amesimComponent.getXCoordinate();
		String amesimYCoordinate = amesimComponent.getYCoordinate();
		String amesimSubModelName = amesimComponent.getSubModelName();
		String amesimSubModelDirectory = amesimComponent.getSubModelDirectory();

		Process setParamProcess;
		try {
			String command = "AMEPython createAMESimComponent.py "
					+ amesimDirectory + " " + modelName + ".ame" + " "
					+ amesimComponentIconName + " " + amesimComponentAlias
					+ " " + amesimXCoordinate + " " + amesimYCoordinate + " "
					+ amesimSubModelName;
			setParamProcess = Runtime.getRuntime().exec(command, null,
					new File(AMESimManager.amesimPythonScriptFolder));

			BufferedReader br = new BufferedReader(new InputStreamReader(
					setParamProcess.getInputStream()));
			while (br.ready())
				System.out.println(br.readLine());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void updateAMESimParameter(AMESimParameter amesimParameter,
			String modelName) {
		URI amesimParameterURI = amesimParameter.getAbout();
		String amesimParameterDataPath = amesimParameterURI.toString().replace(
				baseHTTPURI + "/services/" + modelName + "/parameters/", "");
		amesimParameterDataPath = amesimParameterDataPath.replace("::", "@");
		Process setParamProcess;
		try {
			// ProcessBuilder pb = new ProcessBuilder(
			// "AMEPython",
			// "updateAMESimParameter.py",
			// amesimDirectory,
			// modelName + ".ame",
			// amesimParameterDataPath,
			// amesimParameter.getValue()
			// );
			// pb.directory(new File(amesimPythonScriptFolder));
			// pb.redirectError();
			// setParamProcess = pb.start();

			// String commandString = "AMEPython updateAMESimParameter.py " +
			// amesimDirectory
			// + " " + modelName + ".ame" + " "
			// + amesimParameterDataPath + " "
			// + amesimParameter.getValue();

			setParamProcess = Runtime.getRuntime().exec(
					"AMEPython updateAMESimParameter.py " + amesimDirectory
							+ " " + modelName + ".ame" + " "
							+ amesimParameterDataPath + " "
							+ amesimParameter.getValue(), null,
					new File(AMESimManager.amesimPythonScriptFolder));

			BufferedReader br = new BufferedReader(new InputStreamReader(
					setParamProcess.getInputStream()));
			while (br.ready())
				System.out.println(br.readLine());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void createAMESimGlobalParameter(
			AMESimGlobalParameter amesimGlobalParameter, String modelName) {
		// TODO
	}

	public static void createAMESimLine(AMESimLine amesimLine, String modelName) {
		// TODO
	}

	public static void createAMESimPort(AMESimPort amesimPort, String modelName) {
		// TODO
	}

	public static String getQualifiedName(EObject eObject,
			StringBuffer qualifiedNameBuffer) {
		String qualifiedName = null;
		String eObjecClassName = eObject.eClass().getName();

		if (eObjecClassName.equals("Line")) {
			Line line = (Line) eObject;
			qualifiedName = line.getName();

		} else if (eObjecClassName.contains("Port")) {
			for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
				if (eAttribute.getName().equals("id")) {
					String name = (String) eObject.eGet(eAttribute);
					qualifiedNameBuffer = new StringBuffer();
					qualifiedNameBuffer.insert(0, name);
					break;
				}
			}
			qualifiedName = qualifiedNameBuffer.toString();
			qualifiedName = getShortQualifiedName(qualifiedName);
			qualifiedName = qualifiedName.replaceAll("/", "::");

		} else if (eObjecClassName.contains("Component")) {
			for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
				if (eAttribute.getName().equals("name")) {
					String name = (String) eObject.eGet(eAttribute);
					qualifiedNameBuffer = new StringBuffer();
					qualifiedNameBuffer.insert(0, name);
					break;
				}
			}
			qualifiedName = qualifiedNameBuffer.toString();
			// qualifiedName = getShortQualifiedName(qualifiedName);
			qualifiedName = qualifiedName.replaceAll("/", "::");
		} else if (eObjecClassName.equals("Parameter")) {
			for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
				if (eAttribute.getName().equals("dataPath")) {
					String name = (String) eObject.eGet(eAttribute);
					qualifiedNameBuffer = new StringBuffer();
					qualifiedNameBuffer.insert(0, name);
					break;
				}
			}
			qualifiedName = qualifiedNameBuffer.toString();
			// qualifiedName = getShortQualifiedName(qualifiedName);
			qualifiedName = qualifiedName.replaceAll("/", "::");
			qualifiedName = qualifiedName.replaceAll("@", "::");
		} else if (eObjecClassName.equals("GlobalParameter")) {
			for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
				if (eAttribute.getName().equals("uniqueName")) {
					String name = (String) eObject.eGet(eAttribute);
					qualifiedNameBuffer = new StringBuffer();
					qualifiedNameBuffer.insert(0, name);
					break;
				}
			}
			qualifiedName = qualifiedNameBuffer.toString();
			// qualifiedName = getShortQualifiedName(qualifiedName);
			qualifiedName = qualifiedName.replaceAll("/", "::");
			qualifiedName = qualifiedName.replaceAll("@", "::");
			qualifiedName = qualifiedName.replaceAll(" ", "_");
		} else {
			for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
				if (eAttribute.getName().equals("name")
						| eAttribute.getName().equals("id")) {
					String name = (String) eObject.eGet(eAttribute);
					if (qualifiedNameBuffer == null) {
						qualifiedNameBuffer = new StringBuffer();
						qualifiedNameBuffer.insert(0, name);
					} else {
						qualifiedNameBuffer.insert(0, name + "::");
					}
					break;
				}
			}
			if (!eObject.eContainer().eClass().getName()
					.equals("WorkingDirectory")) {
				getQualifiedName(eObject.eContainer(), qualifiedNameBuffer);
			}
			qualifiedName = qualifiedNameBuffer.toString();
		}

		return qualifiedName;
	}

	public static String getShortQualifiedName(String qualifiedName) {
		String[] qualifiedNameSegments = qualifiedName.split("/");
		String[] newqualifiedNameSegmentsArray = new String[qualifiedNameSegments.length - 1];
		System.arraycopy(qualifiedNameSegments, 1,
				newqualifiedNameSegmentsArray, 0,
				(qualifiedNameSegments.length - 1));
		StringBuffer qNameBuffer = new StringBuffer();
		int i = 0;
		for (String segment : newqualifiedNameSegmentsArray) {
			if (i > 0) {
				qNameBuffer.append("/");
			}
			qNameBuffer.append(segment);
			i++;
		}
		return qNameBuffer.toString();
	}

	private static Link[] getLinkedEReferences(
			Collection<? extends EObject> elementCollection) {

		// counting the number of links
		int linksCount = elementCollection.size();

		String objectType = null;
		if (linksCount > 0) {
			EObject eObject = (EObject) elementCollection.toArray()[0];
			if (eObject instanceof Circuit) {
				objectType = "circuit";
			} else if (eObject instanceof Component) {
				objectType = "components";
			} else if (eObject instanceof Line) {
				objectType = "lines";
			} else if (eObject instanceof Port) {
				objectType = "ports";
			} else if (eObject instanceof Parameter) {
				objectType = "parameters";
			} else if (eObject instanceof GlobalParameter) {
				objectType = "globalparameters";
			}
		}

		// creating linksArray
		Link[] linksArray = null;
		if (linksCount > 0) {
			linksArray = new Link[linksCount];
		}

		// populating linksArray
		int linksArrayIndex = 0;
		for (EObject element : elementCollection) {
			try {
				URI linkedElementURI = null;
				linkedElementURI = new URI(baseHTTPURI + "/services/"
						+ projectId + "/" + objectType + "/"
						+ getQualifiedName(element, null));
				Link link = new Link(linkedElementURI);
				linksArray[linksArrayIndex] = link;
				linksArrayIndex++;
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return linksArray;
	}

	public static void createAMESimElements(AMESimElementsToCreate newElements,
			String modelName) {

		Service2PythonThread createPythonScriptThread = new Service2PythonThread(
				newElements);
		createPythonScriptThread.start();
		// createPythonScriptThread.wait();
		try {
			createPythonScriptThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Process runPythonScriptProcess;
		try {
			String command = "AMEPython createAMESimElements.py "
					+ amesimDirectory + " " + modelName + ".ame";
			runPythonScriptProcess = Runtime.getRuntime().exec(command, null,
					new File(AMESimManager.amesimPythonScriptFolder));

			BufferedReader br = new BufferedReader(new InputStreamReader(
					runPythonScriptProcess.getInputStream()));
			while (br.ready())
				System.out.println(br.readLine());
			int exitValue = runPythonScriptProcess.waitFor();
			if (exitValue == 0) {
				System.out.println("added " + newElements.getAbout());
			} else {
				System.out.println("NOT added " + newElements.getAbout()
						+ "\tView log file!");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
