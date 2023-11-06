package CommandPattern;

public class BedRoomLight implements Light{

	@Override
	public void on() {
		System.out.println("Bed Room Light Turn On");
		
	}

	@Override
	public void off() {
		System.out.println("Bed Room Light Turn Off");
		
	}

}
