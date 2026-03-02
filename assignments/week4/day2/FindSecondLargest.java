package assignments.week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		List<Integer> numbers = new ArrayList<>(List.of(3,2,11,4,6,7));
		
		
		
		Collections.sort(numbers);
		
		int secondLargest = numbers.get(numbers.size()-2);
		
		System.out.println("Second Largest Number is:" + secondLargest);
		
		
		
		
		
	}

}
