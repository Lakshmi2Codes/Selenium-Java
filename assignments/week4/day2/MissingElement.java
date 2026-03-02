package assignments.week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>numbers=new ArrayList<>(List.of(1, 2, 3, 4, 10, 6, 8));
		
		Collections.sort(numbers);
		
		System.out.println("Sorted Number is:" + numbers);
		
		for (int i = 0; i<numbers.size()-1; i++) {
			
			int current = numbers.get(i);
			int next = numbers.get(i+1);
			
			//Check if there is a gap
			
			if (current + 1 != next) {
				
				for (int missing = current+1; missing <next; missing++) {
					
					System.out.println("Missing number:" +missing);
				}
			}
		}

	}

}
