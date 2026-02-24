package homeassignments.week3;

import homeassignments.week3.day3.WebElement;

public class Button extends WebElement {
	
	public void subClass1(String submit) {
		
		System.out.println( "Submit the Button: "+ submit);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button obj2 = new Button ();
		
		obj2.subClass1("Create Lead");

	}

}
