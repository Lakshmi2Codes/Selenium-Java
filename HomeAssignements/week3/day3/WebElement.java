package homeassignments.week3.day3;

public class WebElement {
	
	public void baseClass (String click, String setText) {
		
		System.out.println("Clicked Create Lead");
		System.out.println("Company Name: " + setText);
	}
	
	

	public static void main(String[] args) {
	
		WebElement obj = new WebElement();
		
		obj.baseClass("Created Lead", "TestLeaf");

	}

}
