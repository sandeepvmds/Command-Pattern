
public class StorageBoxCommandDemo {

	public static void main(String[] args) {
		
		
		MakingDeviceMachine plasticBox = new PlasticStorageBox();

		Stop stop = new Stop(plasticBox);

		RemoteControl remoteNew = new RemoteControl(stop);
		remoteNew.buttonPress();

		Start start = new Start(plasticBox);

		RemoteControl remote = new RemoteControl(start);

		remote.buttonPress();

		System.out.println("\n***********************************************************\n");

		MakingDeviceMachine steelBox = new SteelStorageBox();

		Start startCommand = new Start(steelBox);

		RemoteControl remoteCall = new RemoteControl(startCommand);

		remoteCall.buttonPress();

		Stop stopCommand = new Stop(steelBox);

		RemoteControl remoteCallNew = new RemoteControl(stopCommand);
		remoteCallNew.buttonPress();

	

		
	}

}
