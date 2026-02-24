package homeassignments.week3.day4;

public class LoginPage extends BasePage {

	public void BaseClass () {
		
		super.BaseClass("By.id", "click", "get text", "purpose");
		System.out.println("This is subclass overriding");
		
		
		
	}
	
	
    public void subClass1 () {
    	
    	System.out.println("subClass 1");
    	
    }
    	public void subClass2 () {
    	
    	System.out.println("subClass 2");
    	
    	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage obj2 = new LoginPage();
		
		obj2.BaseClass();
		obj2.BaseClass();
		obj2.subClass1();
        obj2.subClass2();
        


	}

}
