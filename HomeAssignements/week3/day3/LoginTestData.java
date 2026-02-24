package homeassignments.week3.day3;

public class LoginTestData extends TestData {

	public void subClass (String enterUserName, String enterPassword) {
		
		System.out.println("UserName: " + enterUserName);
		System.out.println("Password: " + enterPassword);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginTestData obj2 = new LoginTestData();
		
		obj2.baseClass("Enter Credentials", "https://leaftap.com");
		obj2.subClass("Demosalesmanager", "cmsrf");
		
		
	}

}
