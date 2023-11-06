package CommandPattern;

public class LivingRoomLight implements Light{

	@Override
	public void on() {
		System.out.println("Living Room Light Turn On");
		
	}

	@Override
	public void off() {
		System.out.println("Living Room Light Turn Off");
		
	}
	
}
