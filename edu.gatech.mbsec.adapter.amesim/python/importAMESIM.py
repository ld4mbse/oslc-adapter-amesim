# Initializations





# Import needed modules
import os, sys, re, string, signal, ctypes

# sys.path.append("C:\Program Files\AMESim\v1300\scripting\python\win32")
# this sys.path.append command was not commented before!
#sys.path.append("C:\Program Files (x86)\LMS\LMS Imagine.Lab Amesim\v1400\sys\python\win32")

if 'ame_apy' not in sys.modules:
   try:
      from ame_apy import *
   except ImportError:
      print 'Unable to import AMESim API module.\nCheck the AME environment variable.'

	  
# Get license and initialize AMESim Python API
AMEInitAPI(False)	  
	
	
# create file and write to file
f = open('amesimWorkDir.xmi', 'w')	  
f.write('<?xml version="1.0" encoding="UTF-8"?>\n')
f.write('<lms.amesim:WorkingDirectory xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:lms.amesim="http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/">\n')	
	
# find all files in current directory
# amesimDirectory = sys.argv[1]
amesimDirectory = "../amesimmodels"
# for files in os.listdir("."):
for path, subdirs, files in os.walk(amesimDirectory):
	for file in files:
		if file.endswith(".ame"):
			relative_path = os.path.join(path, file)	
			AMEOpenAmeFile(relative_path)
			model_name = AMEGetActiveCircuit()			
			#model_name = file
			unique_name_parts = os.path.join(path, file).split('\\')
			unique_name_first_part = unique_name_parts[len(unique_name_parts) - 2]
			isTopDirectory = unique_name_first_part.startswith( '../' )			
			if isTopDirectory:
				unique_name = unique_name_parts[len(unique_name_parts) - 1]
			else:
				unique_name = unique_name_parts[len(unique_name_parts) - 2] + '---' + unique_name_parts[len(unique_name_parts) - 1]
			print unique_name
			unique_name = unique_name.replace('.ame','')
			f.write('\t<circuit name="')
			f.write(unique_name)
			f.write('">\n')
			
			
			portVariablePortIDMap= {}
			
			#get all components_and_lines
			components_and_lines = AMEGetCircuitAliasesList()
			
			if components_and_lines != None:		
							
				globalParameterSet = set()
				parameterNameObjectTuple = {}		
				
				for alias3 in components_and_lines:			
					alias_infos3 = AMEGetAliasInfos(alias3)
					print alias_infos3
					
					# check subcomponents if component is supercomponent
					nested_components_and_lines = AMEGetCircuitAliasesList()
					if nested_components_and_lines != None:
						print 'super component found!'
						print len(nested_components_and_lines)
					
					
					
					#print global parameters
					
					# # list global parameters (other API function)
					# num, titles, values, names, units = amegetgpar(model_name,alias3)
					# print 'new_global_num'
					# print num
					# print titles
					# print values
					# print names
					# print units
					
					# list global parameters
					print 'only_global'
					AMEParVarIter2 = AMECreateParVarIteration(alias3, ame_parvar_all)
					for AMEParVar2 in AMEParVarIter2:
						if AMEIsParameter(AMEParVar2):
							print						
							# xmi:id
							#f.write(' xmi:id="')
							#f.write(AMECopyDataPath(AMEParVar))											
							# data path						
							# print AMECopyDataPath(AMEParVar2)
							# print AMEGetParameterValue(AMEParVar2)[0]		
							oldString = AMEGetParameterValue(AMEParVar2)[0]
							# valueString = '0.0000e +06'
							valueString = oldString.lower()
							# valueString =  'MASS'
							# print valueString
							print isinstance(valueString, basestring)
							# valueString = 'globalparameter'
								
							print valueString
							
							# # value
							# print AMEGetParameterValue(AMEParVar2)[0]
							# f.write('" value="')
							# f.write(AMEGetParameterValue(AMEParVar2)[0])						
							# print str(AMEGetParameterValue(AMEParVar2)[0])
							# check if value is global parameter
							#m = re.search('\W', str(AMEGetParameterValue(AMEParVar2)[0]))
							#m = re.search('(?<=abc)def', 'abcdef')
							
							# newString = 'abcd'
							# pattern = re.compile('^[a-zA-Z]+$')	
							# p = re.compile(str(valueString))
													
							# if re.compile('^[a-z]', re.I).match(valueString) != None:
							# if re.match('^[a-z]',newString) != None:
								# print 'regex works in python'
								
							isParameterGlobal = False
							if valueString.startswith('a') | valueString.startswith('b') | valueString.startswith('c') | valueString.startswith('d'):
								isParameterGlobal = True
								
							if valueString.startswith('e') | valueString.startswith('f') | valueString.startswith('g') | valueString.startswith('h'): 
								isParameterGlobal = True
										
							if valueString.startswith('i') | valueString.startswith('j') | valueString.startswith('k') | valueString.startswith('l'):
								isParameterGlobal = True
								
							if valueString.startswith('m') | valueString.startswith('n') | valueString.startswith('o') | valueString.startswith('p'):
								isParameterGlobal = True
								
							if valueString.startswith('q') | valueString.startswith('r') | valueString.startswith('s') | valueString.startswith('t'):
								isParameterGlobal = True
								
							if valueString.startswith('u') | valueString.startswith('v') | valueString.startswith('w') | valueString.startswith('x'):
								isParameterGlobal = True
								
							if valueString.startswith('y') | valueString.startswith('z'):
								isParameterGlobal = True
								
							if isParameterGlobal:
								globalParameterSet.add(oldString)
								parameterNameObjectTuple[oldString] = AMEParVar2
								
				
				for globalParameter in globalParameterSet:			
					# print 'global parameter'
					# print globalParameter
					# # print pattern.match(valueString).group(0)							
					f.write('\t\t<globalParameter')
					# f.write(' dataPath="')
					# f.write(globalParameter)												
					# f.write('"/>\n')
							
					AMEParVar3 = parameterNameObjectTuple[globalParameter]
					print AMECopyDataPath(AMEParVar3)			
					# uniqueName
					name = AMEGetParameterValue(AMEParVar3)[0]
					print name
					f.write(' uniqueName="')
					f.write(AMEGetParameterValue(AMEParVar3)[0])
					# # value
					# # print AMEGetGlobalParameterValue('R')[0]
					# # print AMEGetGlobalParameterValue(globalParameter)[0]
					# print AMEGetGlobalParameterValue(name)
					
					try:
						if AMEGetGlobalParameterValue(name) != None:
							print 'global parameter value'
							print AMEGetGlobalParameterValue(AMEGetParameterValue(AMEParVar3)[0])
							f.write('" value="')
							f.write(AMEGetGlobalParameterValue(AMEGetParameterValue(AMEParVar3)[0])[0])
							# # f.write(AMEGetGlobalParameterValue(AMEGetParameterValue(AMEParVar3)[0])[0])
					except:
						print 'global parameter value not found in model'
					
					# unit
					print AMEGetParameterValue(AMEParVar3)[1]
					f.write('" unit="')
					f.write(str(AMEGetParameterValue(AMEParVar3)[1]))
					# title
					print AMEGetParameterInfos(AMEParVar3)[1]
					f.write('" title="')
					f.write(AMEGetParameterInfos(AMEParVar3)[1])	
					f.write('"/>\n')
				
				

				for alias in components_and_lines:			
					alias_infos = AMEGetAliasInfos(alias)
					print alias_infos
					if alias_infos[0] == 'ame_component':
						print
						print alias
						f.write('\t\t<component name="')
						f.write(alias)
						f.write('" subModelName="')
						f.write(alias_infos[2])
						f.write('" subModelInstanceNumber="')
						f.write(str(alias_infos[3]))
						f.write('" subModelDirectory="')
						f.write(alias_infos[4])
						
						if alias_infos[5] != None:
							f.write('" categoryName="')
							f.write(alias_infos[5])
						
						f.write('">\n')
						
						
						
						AMEParVarIter = AMECreateParVarIteration(alias, ame_parvar_all)
						for AMEParVar in AMEParVarIter:
							if AMEIsParameter(AMEParVar):
								print
								f.write('\t\t\t<parameter')
								# xmi:id
								#f.write(' xmi:id="')
								#f.write(AMECopyDataPath(AMEParVar))											
								# data path						
								print AMECopyDataPath(AMEParVar)
								f.write(' dataPath="')
								f.write(AMECopyDataPath(AMEParVar))
								# value
								print AMEGetParameterValue(AMEParVar)[0]
								f.write('" value="')
								f.write(AMEGetParameterValue(AMEParVar)[0])
								# unit
								print AMEGetParameterValue(AMEParVar)[1]
								f.write('" unit="')
								f.write(str(AMEGetParameterValue(AMEParVar)[1]))
								# title
								print AMEGetParameterInfos(AMEParVar)[1]
								f.write('" title="')
								f.write(AMEGetParameterInfos(AMEParVar)[1])	
								f.write('"/>\n')
							
							# if AMEIsVariable(AMEParVar):
								# print
								# f.write('\t\t\t<variable')
								# # xmi:id
								# #f.write(' xmi:id="')
								# #f.write(AMECopyDataPath(AMEParVar))											
								# # data path						
								# print AMECopyDataPath(AMEParVar)
								# f.write(' dataPath="')
								# f.write(AMECopyDataPath(AMEParVar))
								# # dimension
								# print AMEGetVariableInfos(AMEParVar)[0]
								# f.write('" dimension="')
								# f.write(str(AMEGetVariableInfos(AMEParVar)[0]))							
								# # title
								# print AMEGetVariableInfos(AMEParVar)[2]
								# f.write('" title="')
								# f.write(AMEGetVariableInfos(AMEParVar)[2])	
								# f.write('"/>\n')
								
						# number of ports
						number_of_ports = AMEGetNumberOfPorts(alias)
						print 'number of ports: ' 
						print(number_of_ports)
						print ('\n') 	
						for i in range(number_of_ports):
							print 'port type'
							print AMEGetPortType(alias, i)
							print
							f.write('\t\t\t<port')
							f.write(' id="')
							f.write(model_name)
							f.write('/')
							f.write(alias)
							f.write('/')
							f.write(str(i + 1))
							f.write('" type="')
							f.write(AMEGetPortType(alias, i))
							f.write('"/>\n')
								
							#AMEParVarPortIteration = AMECreateParVarIterationOnPort(alias,i)
							#for AMEParVarPort in AMEParVarPortIteration:
								#print 'AMEParVarPort'
								#f.write('Component AMEParVarPort')
								#f.write('\n')
								# print AMEParVarPort
								#print AMECopyDataPath(AMEParVarPort)
								#f.write(AMECopyDataPath(AMEParVarPort))
								#f.write('\n')
								# portVariable = AMECopyDataPath(AMEParVarPort)												
								# portVariableName, portComponent = portVariable.split('@')
								# # new port id
								# portID = str(i) + '@' + portComponent
								# portVariablePortIDMap[portVariable] = portID
								
						
									
								
						f.write('\t\t</component>\n')		

					# includes only visible lines!!	
					if alias_infos[0] == 'ame_line':
						print
						print 'line'
						print alias
						f.write('\t\t<line name="')
						f.write(alias)
						# f.write('" iconname="')
						# f.write(alias_infos[1])	
						f.write('" subModelName="')
						f.write(alias_infos[2])
						f.write('" subModelInstanceNumber="')
						f.write(str(alias_infos[3]))
						if alias_infos[4] != None:
							f.write('" subModelDirectory="')
							f.write(alias_infos[4])							
						f.write('"/>\n')
						
						# # number of ports
						#number_of_ports = AMEGetNumberOfPorts(alias)
						#print 'number of ports: ' 
						#print(number_of_ports)
						#for i in range(number_of_ports):
							# print 'port type'
							#AMEParVarPortIteration = AMECreateParVarIterationOnPort(alias,i)
							#for AMEParVarPort in AMEParVarPortIteration:
								#print 'Line AMEParVarPort'
								#f.write('Line AMEParVarPort')
								#f.write('\n')
								# print AMEParVarPort
								#print AMECopyDataPath(AMEParVarPort)
								#f.write(AMECopyDataPath(AMEParVarPort))
								#f.write('\n')
								#portVariable = AMECopyDataPath(AMEParVarPort)
								# portID = portVariablePortIDMap[portVariable]
								# print portID
								
								
						
						
						# AMEParVarPortIteration = AMECreateParVarIterationOnPort(alias,0)
						# for AMEParVarPort in AMEParVarPortIteration:
							# print 'AMEParVarPort'
							# print AMEParVarPort
							# print AMECopyDataPath(AMEParVarPort)
				
				
						# AMEParVarIteration = AMECreateParVarIteration(alias, ame_parvar_all)
						# for AMEParVar4 in AMEParVarIteration:
							# print AMEParVar4
					
					# # includes not components nor lines!!	
					# if alias_infos[0] == 'ame_alias_undefined':
						# print
						# print 'alias_undefined'
						# print alias
						# f.write('\t\t<undefined ="')
						# AMEParVarIteration = AMECreateParVarIteration(alias, ame_parvar_all)
						# for AMEParVar4 in AMEParVarIteration:
							# print AMEParVar4
					
				print 'components done'
				
					
				
				# # includes all lines!
				# AMECompLineIter = AMECreateCompLineIteration(ame_compline_line)
				# for AMECompLine in AMECompLineIter:
					# print
					# print 'line2'
					# # name
					# print AMECopyAliasPath(AMECompLine)
					# f.write('\t\t<line2 name="')
					
					# # number of ports
					# number_of_ports = AMEGetNumberOfPorts(AMECompLine)
					# print 'number of ports: ' 
					# print(number_of_ports)
					# for k in range(number_of_ports):
						# print 'port type'
						# AMEParVarPortIteration = AMECreateParVarIterationOnPort(AMECompLine,k)
						# print AMEParVarPortIteration
						# for AMEParVarPort7 in AMEParVarPortIteration:
							# print 'AMEParVarPort'
							# print AMEParVarPort7
							# print AMECopyDataPath(AMEParVarPort7)
							# portVariable = AMECopyDataPath(AMEParVarPort7)
							# portID = portVariablePortIDMap[portVariable]
							# print portID
					
					# AMEParVarIteration = AMECreateParVarIteration(AMECompLine, ame_parvar_all)
					# for AMEParVar4 in AMEParVarIteration:
						# print AMEParVar4
					
					# # print AMEGetProperties(AMECompLine)
					# print AMEGetConfigurationProperties(AMECompLine)
					# properties = AMEGetConfigurationProperties(AMECompLine)
					
					
					# f.write('\t\t</line>"')
					
			f.write('\t</circuit>\n')
			AMESaveCircuit()
			AMECloseCircuit(True)



# close file 
f.write('</lms.amesim:WorkingDirectory>')
f.close()	
	  
	  
	  




print 'XMI file created'


# Finalize script

# Return license and close AMESim Python API
AMECloseAPI()

print 'XMI file created'
#os._exit(0)
exit(0)

# http://stackoverflow.com/questions/1064335/in-python-2-5-how-do-i-kill-a-subprocess
#PROCESS_TERMINATE = 1
#handle = ctypes.windll.kernel32.OpenProcess(PROCESS_TERMINATE, False, os.getpid())
#ctypes.windll.kernel32.TerminateProcess(handle, -1)
#ctypes.windll.kernel32.CloseHandle(handle)
