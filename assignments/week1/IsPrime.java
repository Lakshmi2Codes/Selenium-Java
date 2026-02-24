package assignments.week1;

public class IsPrime {

	public static void main(String[] args) {
		
		int [] numbers = {2,7,19,17,20,26,99};   
		
		for (int n:numbers) {

        boolean isPrime = true;

       
        if (n <= 1) {
            isPrime = false;
        } else {
            
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        
        if (isPrime) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is NOT a Prime number");
        }
    }

	}

	}


