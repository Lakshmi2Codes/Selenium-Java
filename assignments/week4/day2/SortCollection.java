package assignments.week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollection {

	public static void main(String[] args) {
			
		
		//Add to List
		 List<String> companyList = new ArrayList<>(List.of("HCL", "Wipro","Aspire Systems", "CTS"));
		
		 //Sort ascending
		Collections.sort(companyList);
		
		//Reverse loop	
		
		System.out.println("Reversed Order:");
		for (int i = companyList.size()- 1; i >= 0; i--) {
			
	    System.out.println(companyList.get(i));
		    
		}
	

	}

}
