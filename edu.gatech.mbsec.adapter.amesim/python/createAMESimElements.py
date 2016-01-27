import os, sys, re, string
if 'ame_apy' not in sys.modules:
	try:
		from ame_apy import *
	except ImportError:
		print 'Unable to import AMESim API module.Check the AME environment variable.'
AMEInitAPI(False)
amesimDirectory = sys.argv[1]
amesimCircuitName = sys.argv[2]
for file in os.listdir(amesimDirectory):
	if file == amesimCircuitName:
		AMEOpenAmeFile(amesimDirectory + "/" + file)
		model_name = AMEGetActiveCircuit()

		AMEAddComponent('mass_friction1port', 'mass_friction1port', (int(40), int(99)))
		AMEMoveComponent('mass_friction1port', (int(40), int(99)))
		AMEChangeSubmodel('mass_friction1port', 'MAS003')
		AMEAddComponent('springdamper01', 'springdamper01', (int(89), int(99)))
		AMERotateComponent('springdamper01')
		AMEMoveComponent('springdamper01', (int(89), int(99)))
		AMEChangeSubmodel('springdamper01', 'SD0000A')
		AMEAddComponent('simple_crank', 'simple_crank', (int(138), int(103)))
		AMERotateComponent('simple_crank')
		AMEFlipComponent('simple_crank')
		AMEMoveComponent('simple_crank', (int(138), int(103)))
		AMEChangeSubmodel('simple_crank', 'CRANK0')
		AMEAddComponent('rconnector', 'rconnector', (int(176), int(149)))
		AMERotateComponent('rconnector')
		AMERotateComponent('rconnector')
		AMEMoveComponent('rconnector', (int(176), int(149)))
		AMEChangeSubmodel('rconnector', 'RCON00')
		AMEAddComponent('simple_crank', 'simple_crank_2', (int(229), int(103)))
		AMERotateComponent('simple_crank_2')
		AMEMoveComponent('simple_crank_2', (int(229), int(103)))
		AMEChangeSubmodel('simple_crank_2', 'CRANK0')
		AMEAddComponent('springdamper01', 'springdamper01_2', (int(287), int(99)))
		AMERotateComponent('springdamper01_2')
		AMEMoveComponent('springdamper01_2', (int(287), int(99)))
		AMEChangeSubmodel('springdamper01_2', 'SD0000A')
		AMEAddComponent('rload01', 'rload01', (int(187), int(174)))
		AMERotateComponent('rload01')
		AMEMoveComponent('rload01', (int(187), int(174)))
		AMEChangeSubmodel('rload01', 'RL00')
		AMEAddComponent('mass_friction1port', 'mass_friction1port_2', (int(336), int(99)))
		AMERotateComponent('mass_friction1port_2')
		AMERotateComponent('mass_friction1port_2')
		AMEMoveComponent('mass_friction1port_2', (int(336), int(99)))
		AMEChangeSubmodel('mass_friction1port_2', 'MAS003')
		AMEConnectTwoPorts('mass_friction1port', 0, 'springdamper01', 0)
		AMEConnectTwoPorts('springdamper01', 1, 'simple_crank', 1)
		AMEConnectTwoPorts('simple_crank', 0, 'rconnector', 1)
		AMEConnectTwoPorts('rconnector', 0, 'simple_crank_2', 0)
		AMEConnectTwoPorts('rconnector', 2, 'rload01', 0)
		AMEConnectTwoPorts('simple_crank_2', 1, 'springdamper01_2', 0)
		AMEConnectTwoPorts('springdamper01_2', 1, 'mass_friction1port_2', 0)
		AMESetParameterValue('mass@mass_friction1port', '100')
		AMESetParameterValue('srate@springdamper01', '1.00000000000000e+05')
		AMESetParameterValue('cdamp@springdamper01', '1.00000000000000e+03')

AMESaveCircuit()
AMECloseCircuit(True)
AMECloseAPI()



