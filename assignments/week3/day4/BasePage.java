package assignments.week3.day4;

public class BasePage {
	
public void BaseClass (String findElement, String clickElement, String enterText, String performCommontasks) {
		
		System.out.println("This is to: "+ findElement);
		System.out.println("To click the element: " + clickElement);
		System.out.println("Findelement By.LinkText: " + enterText);
		System.out.println("Perform Common Tasks is to: " + performCommontasks);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasePage obj = new BasePage();
		
		obj.BaseClass("By.id", "click", "get text", "purpose");

	}

}
