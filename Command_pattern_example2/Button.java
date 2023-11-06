package Command_pattern_example2;

public class Button {
	private String label;
	private Command command;

	public Button(Command command) {
		super();
		this.command = command;
	}
	
	public void click() {
		command.execute();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
