package homeassignments.week3.day3;

public class TestData {
	
	public void baseClass (String enterCredentials, String navigateToHomePage) {
		
		System.out.println("Load the URL: " + navigateToHomePage);
		System.out.println("Login Page: " + enterCredentials);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestData obj = new TestData ();
		
		obj.baseClass("Enter Username & Password", "https://leaftap.com");

	}

}
