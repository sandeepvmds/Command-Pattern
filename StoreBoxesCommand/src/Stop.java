
public class Stop implements Command{
	
	private MakingDeviceMachine deviceMachine;

	public Stop(MakingDeviceMachine device) {
		deviceMachine =  device ;
	}

	@Override
	public void process() {
	 
		deviceMachine.stop();
		
	}

	public MakingDeviceMachine getDeviceMachine() {
		return deviceMachine;
	}

	public void setDeviceMachine(MakingDeviceMachine deviceMachine) {
		this.deviceMachine = deviceMachine;
	}

}
