# Initializations

# Import needed modules
import os, sys, re, string

if 'ame_apy' not in sys.modules:
   try:
      from ame_apy import *
   except ImportError:
      print 'Unable to import AMESim API module.\nCheck the AME environment variable.'
	  
# Get license and initialize AMESim Python API
AMEInitAPI(False)	  
	
amesimDirectory = sys.argv[1]
amesimCircuitName = sys.argv[2]
amesimParameterDataPath = sys.argv[3]
amesimParameterValue = sys.argv[4]

print amesimDirectory
print amesimCircuitName
print amesimParameterDataPath
print amesimParameterValue

# find file in current directory
for file in os.listdir(amesimDirectory):
	if file == amesimCircuitName:
		print "model found"        
		# open AMESIM file
		#AMEOpenAmeFile('FlatTwin.ame')		
		AMEOpenAmeFile(amesimDirectory + "/" + file)
		print "model opened"		     
		model_name = AMEGetActiveCircuit()  
		print "model activated"              
		print
		print model_name	
		valueString = str(amesimParameterValue)	
		AMESetParameterValue(amesimParameterDataPath, valueString)
        print "update performed"
        # Save system
        AMESaveCircuit()
        print "model saved"
        AMECloseCircuit(True)
        print "model closed"
        break
		
# Finalize script

# Return license and close AMESim Python API
AMECloseAPI()