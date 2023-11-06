package CommandPattern;

public class RemoteController {

	Command oncommand;
	Command offcommand;
	
	void setCommand(Command oncommand ,Command offcommand) {
		this.oncommand = oncommand;
		this.offcommand = offcommand;
	}
	
	void onButtonPressed() {
		this.oncommand.execute();
	}
	
	void offButtonPressed() {
		this.offcommand.execute();
	}
}
