
public class Start implements Command {
	
	private MakingDeviceMachine deviceMachine;

	public Start(MakingDeviceMachine device) {
		deviceMachine = device;
	}

	@Override
	public void process() {
		deviceMachine.start();
		
	}

	public MakingDeviceMachine getDeviceMachine() {
		return deviceMachine;
	}

	public void setDeviceMachine(MakingDeviceMachine deviceMachine) {
		this.deviceMachine = deviceMachine;
	}

}
