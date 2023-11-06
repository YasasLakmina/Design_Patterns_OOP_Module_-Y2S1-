package CommandPattern;

public class CommandPatternDemo {
	public static void main(String[] args) {
		Light LivingRoomLight = new LivingRoomLight();
		Light BedRoomLight = new BedRoomLight();
		
		Command onCommandLivingRoom = new OnCommand(LivingRoomLight);
		Command offCommandLivingRoom = new OffCommand(LivingRoomLight);
		
		Command onCommandBedRoom = new OnCommand(BedRoomLight);
		Command offCommandBedRoom= new OffCommand(BedRoomLight);
		
		RemoteController remoteController = new RemoteController();
		remoteController.setCommand(onCommandLivingRoom, offCommandLivingRoom);
		remoteController.onButtonPressed();
		remoteController.offButtonPressed();
		
		remoteController.setCommand(onCommandBedRoom, offCommandBedRoom);
		remoteController.onButtonPressed();
		remoteController.offButtonPressed();
	}
}
