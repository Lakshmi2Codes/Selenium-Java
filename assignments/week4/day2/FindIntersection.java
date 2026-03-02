package assignments.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      
        // Step 1: List arrays
        List<Integer> list1 = new ArrayList<>(List.of(3, 2, 11, 4, 6, 7));
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 8, 4, 9, 7));


        // Step 2: Compare values and print common elements
        System.out.println("Equal values in both arrays:");
        for (int value : list1) {
            if (list2.contains(value)) {
                System.out.println(value);
            }
        }
    }
}
	


