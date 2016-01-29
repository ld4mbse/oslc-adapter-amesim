package edu.gatech.mbse.oslc4jamesim.application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import edu.gatech.mbsec.adapter.amesim.resources.AMESimComponent;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimElementsToCreate;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimLine;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimParameter;

public class Service2PythonThread extends Thread{
	AMESimElementsToCreate newElements;
	
	public Service2PythonThread(AMESimElementsToCreate newElements) {
		super();
		this.newElements = newElements;
	}

	

	public void run() {
		File pythonScriptfile = new File(".\\python\\createAMESimElements.py");
		if (!pythonScriptfile.exists()) {
			try {
				pythonScriptfile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		StringBuffer pythonScript = new StringBuffer("");
		pythonScript.append("import os, sys, re, string\r\n");
		pythonScript.append("if 'ame_apy' not in sys.modules:\r\n");
		pythonScript.append("\ttry:\r\n");
		pythonScript.append("\t\tfrom ame_apy import *\r\n");
		pythonScript.append("\texcept ImportError:\r\n");
		pythonScript
				.append("\t\tprint 'Unable to import AMESim API module.Check the AME environment variable.'\r\n");
		pythonScript.append("AMEInitAPI(False)\r\n");
		pythonScript.append("amesimDirectory = sys.argv[1]\r\n");
		pythonScript.append("amesimCircuitName = sys.argv[2]\r\n");
		pythonScript.append("for file in os.listdir(amesimDirectory):\r\n");
		pythonScript.append("\tif file == amesimCircuitName:\r\n");
		pythonScript
				.append("\t\tAMEOpenAmeFile(amesimDirectory + \"/\" + file)\r\n");
		pythonScript.append("\t\tmodel_name = AMEGetActiveCircuit()\r\n");
		pythonScript.append("\r\n");

		// add all addAMESimComponent commands
		for (AMESimComponent amesimComponent : newElements
				.getComponentsToCreate()) {
			pythonScript.append("\t\tAMEAddComponent('"
					+ amesimComponent.getIconName() + "', '"
					+ amesimComponent.getName() + "', (int("
					+ amesimComponent.getXCoordinate() + "), int("
					+ amesimComponent.getYCoordinate() + ")))\r\n");
			for (int i = 0; i < amesimComponent.getNumberOfRotations(); i++) {
				pythonScript.append("\t\tAMERotateComponent('"
						+ amesimComponent.getName() + "')\r\n");
			}
			if (amesimComponent.getIsFlipped()) {
				pythonScript.append("\t\tAMEFlipComponent('"
						+ amesimComponent.getName() + "')\r\n");
			}
			pythonScript.append("\t\tAMEMoveComponent('"
					+ amesimComponent.getName() + "', (int("
					+ amesimComponent.getXCoordinate() + "), int("
					+ amesimComponent.getYCoordinate() + ")))\r\n");
			pythonScript.append("\t\tAMEChangeSubmodel('"
					+ amesimComponent.getName() + "', '"
					+ amesimComponent.getSubModelName() + "')\r\n");
		}

		// add all lines
		for (AMESimLine amesimLine : newElements.getLinesToCreate()) {
			pythonScript.append("\t\tAMEConnectTwoPorts('" + amesimLine.getSourceComponentName() +"', " + amesimLine.getSourcePortIndex() + ", '" + amesimLine.getTargetComponentName() + "', " + amesimLine.getTargetPortIndex() + ")\r\n");
		}

		// set all parameters
		for (AMESimParameter amesimParameter : newElements
				.getParametersToCreate()) {
			pythonScript.append("\t\tAMESetParameterValue('" + amesimParameter.getDataPath() + "', '" + amesimParameter.getValue() + "')\r\n");
		}

		pythonScript.append("\r\n");
		pythonScript.append("AMESaveCircuit()\r\n");
		pythonScript.append("AMECloseCircuit(True)\r\n");		
		pythonScript.append("AMECloseAPI()\r\n");
		pythonScript.append("\r\n");
		pythonScript.append("\r\n");
		pythonScript.append("\r\n");
		
		
		
		FileWriter fw;
		try {
			fw = new FileWriter(pythonScriptfile.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(pythonScript.toString());
			bw.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}	
	}
}
