package homeassignments.week3.day2;

public class CheckBoxButton extends Button {
	
	
	public void subClass3 (String clickCheckButton) {
		
		System.out.println("CheckBox Button Clicked: "+ clickCheckButton);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBoxButton obj4 = new CheckBoxButton();
		
		obj4.subClass3("Yes");

	}

}
