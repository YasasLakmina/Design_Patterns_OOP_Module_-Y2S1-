package Template_Method_Pattern;

public class MyMain {
	public static void main(String[] args) {
		TransferMonyTask task = new TransferMonyTask(new AuditTrail());
		task.execute();
		
		GenerateReportTask report = new GenerateReportTask(new AuditTrail());
		report.execute();
	}
}
