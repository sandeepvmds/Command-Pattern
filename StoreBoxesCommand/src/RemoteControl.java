
public class RemoteControl {
	
	private Command plateCommand ;

	public Command getPlateCommand() {
		return plateCommand;
	}

	public void setPlateCommand(Command plateCommand) {
		this.plateCommand = plateCommand;
	}

	public RemoteControl(Command plateCommand) {
		 
		this.plateCommand = plateCommand;
	}
	
	public void buttonPress() {
		plateCommand.process();
	}
	
	

}
