package week4.day1;

public abstract class CanaraBank implements Payments {

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		
		System.out.println("UPI payment method selected from Abstract class");
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		
		System.out.println("Card Payments method selected from Abstract class");
		
	}


	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		
		System.out.println("Internet Banking method selected from Abstract class");
		
	}




	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery method from Abstract Class");
		
	}
	
			
		
	abstract void recordPaymentDetails(); {
        System.out.println("Recording payment details in Canara Bank system");
        
        
    }
		
		

	

	
	

	
	
	


}
