package edu.gatech.mbse.oslc4jamesim.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder.Redirect;

public class AMESim2XMIThread extends Thread {

	// User-defined location of AMESim models

	// variable capturing batch file location,
	// http://stackoverflow.com/questions/14286457/using-parameters-in-batch-files-at-dos-command-line
	// Passing argument to batch file,
	// http://stackoverflow.com/questions/14286457/using-parameters-in-batch-files-at-dos-command-line
	// Passing argument from command line to python script,
	// http://www.bnikolic.co.uk/blog/python-running-cline.html
	public void run() {

		// Execute Python script from the command line
		try {
			

//			String[] cmdarray = new String[1];
//			cmdarray[0] = "AMEPython importAMESIM.py"; // (AMEPython process
														// doesn't end by
														// himself!!)
			// cmdarray[1] = "exit";

			// With the AMESim installation comes a python.bat file (loads
			// python.exe with all AMESim libraries by setting Python-specific
			// environment variables)
//			Process process = Runtime.getRuntime().exec("AMEPython importAMESIM.py", null,
//					new File(AMESimManager.amesimPythonScriptFolder));

			// always delete XMI file
			if(new File("python/amesimWorkDir.xmi").exists()){
				new File("python/amesimWorkDir.xmi").delete();
			}
			
			
			ProcessBuilder pb = new ProcessBuilder("AMEPython", "importAMESIM.py");
			pb.directory(new File(AMESimManager.amesimPythonScriptFolder));
			File log = new File("log");
			pb.redirectErrorStream(true);
			pb.redirectOutput(Redirect.appendTo(log));
			Process process = pb.start();
			assert pb.redirectInput() == Redirect.PIPE;
			assert pb.redirectOutput().file() == log;
			assert process.getInputStream().read() == -1;

			// new
			// File("C:/Users/rb16964/git/oslc4jamesim.wink/oslc4jamesim-wink/python"));
			// .exec("python importAMESIM.py", null, new
			// File(amesimPythonScriptFolder));

			

			process.waitFor();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
