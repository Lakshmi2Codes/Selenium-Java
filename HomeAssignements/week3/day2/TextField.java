package homeassignments.week3.day2;

public class TextField extends WebElement {
	
	public void subClass2 (String getText) {
		
		System.out.println("First Name:" +  getText);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextField obj3 = new TextField ();
		
		obj3.subClass2("Lakshmi");

	}

}
