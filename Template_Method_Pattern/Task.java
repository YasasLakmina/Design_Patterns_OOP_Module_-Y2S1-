package Template_Method_Pattern;

public abstract class Task {
	private AuditTrail auditTrail;
		
	public Task(AuditTrail auditTrail) {
		this.auditTrail = auditTrail;
	}

	public void execute() {
		auditTrail.record();
		
		doExecute();
	}
	
	protected abstract void doExecute();
}
