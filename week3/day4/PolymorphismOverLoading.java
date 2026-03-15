package week3.day4;

public class PolymorphismOverLoading {
	
	
	public void reportStep(String msg, String status) {
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
       
        }
	public void reportStep(String msg, String status, boolean snap) {
	        System.out.println("Message: " + msg);
	        System.out.println("Status: " + status);
	        if (snap) {
	            System.out.println("Snapshot taken: Yes");
	        } else {
	            System.out.println("Snapshot taken: No");
	        }
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismOverLoading report = new PolymorphismOverLoading();
		
		report.reportStep("Login Successful", "PASS");
		report.reportStep("Validation Failed", "Fail", false);
	}

}
