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
amesimComponentIconName = sys.argv[3]
amesimComponentAlias = sys.argv[4]
amesimXCoordinate = sys.argv[5]
amesimYCoordinate = sys.argv[6]
amesimSubModelName = sys.argv[7]
# amesimSubModelDirectory = sys.argv[6]

print amesimDirectory
print amesimCircuitName
print amesimComponentIconName
print amesimComponentAlias
print amesimXCoordinate
print amesimYCoordinate
print amesimSubModelName
# print amesimSubModelDirectory

# find file in current directory
# for files in os.listdir("."):
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
		
		# Add component
		AMEAddComponent(amesimComponentIconName, amesimComponentAlias, (int(amesimXCoordinate), int(amesimYCoordinate)))
		print "component added"
		
		# Set submodel to component
        # AMEChangeSubmodel(amesimComponentAlias, amesimSubModelName, amesimSubModelDirectory)
        AMEChangeSubmodel(amesimComponentAlias, amesimSubModelName)
        print "component submodel set"
        
        # Save system
        AMESaveCircuit()
        print "model saved"
        AMECloseCircuit(True)
        print "model closed"
        break
		
# Finalize script

# Return license and close AMESim Python API
AMECloseAPI()