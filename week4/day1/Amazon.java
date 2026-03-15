package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	void recordPaymentDetails() {
		System.out.println("RecordPaymentDetails implemented on Amazon");
		
	}

	public static void main (String[] args) {
	
	Amazon obj = new Amazon();
	
	obj.cardPayments();
    obj.cashOnDelivery();
    obj.internetBanking();
    obj.upiPayments();
    obj.recordPaymentDetails();
	
	
	}
	
}
