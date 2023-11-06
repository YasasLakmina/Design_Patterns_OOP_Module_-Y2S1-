package Command_pattern_example2;

public class MyMain {
	public static void main(String[] args) {
		CustomerService service = new CustomerService();
		AddCustomerCommand command = new AddCustomerCommand(service);
		Button button = new Button(command);
		button.click();
	}
}
