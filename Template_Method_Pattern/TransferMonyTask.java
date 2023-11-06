package Template_Method_Pattern;

public class TransferMonyTask extends Task{
	public TransferMonyTask(AuditTrail auditTrail) {
		super(auditTrail);
	}

	@Override
	protected void doExecute() {
		System.out.println("Transfer Money");
		
	}
}
