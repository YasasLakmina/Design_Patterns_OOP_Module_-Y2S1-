package Template_Method_Pattern;

public class GenerateReportTask extends Task{

	public GenerateReportTask(AuditTrail auditTrail) {
		super(auditTrail);
	}

	@Override
	protected void doExecute() {
		System.out.println("Generate Report");
		
	}
	
	
	
	
}
