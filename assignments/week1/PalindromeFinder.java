package assignments.week1;

public class PalindromeFinder {

	public static void main(String[] args) {
		
		int [] numbers = {243342,2433426,8984898,89898989,1212121,4344343,4343434};
		 
		for (int input:numbers) {
			
			int output = 0;
			
			
			System.out.println("Original number: " + input);
			
		
		for (int i=input; i > 0; i = i / 10) {
			
			int rem = i % 10;
			
			output = output * 10 + rem;
				
		}
			
			System.out.println("Reversed number: " + output);
			
		
		if (input==output) {
			
			System.out.println("Result: This number is a palindrome");
		}
		
		else { 
			
			System.out.println("Result: This number is not a palindrome");
			
		}
		
		}
		

	}

}
