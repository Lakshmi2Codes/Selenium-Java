package week3.day4;

public class OverridingChild extends OverRiding {
	
	public void BaseClass () {
		
		super.BaseClass();
        System.out.println("This is sub class overiding");
        
	}
        public void subClass1 () {
        	
        	System.out.println("subClass 1");
        	
        }
        	public void subClass2 () {
        	
        	System.out.println("subClass 2");
        	
        	
        }
        	
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverridingChild Obj = new OverridingChild ();
		
		Obj.BaseClass();
		Obj.subClass1();
		Obj.subClass2();


		
	}

}
