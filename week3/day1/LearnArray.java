package week3.day1;

import java.util.Arrays;



public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int scores [] = {90,98,87,92,100};
		
		int arrayLength = scores.length;
		
		
		//to find the number of elements - length
		System.out.println("The number of element is: "+arrayLength);
		
		// to retrieve and element from an array
		
		System.out.println(scores[4]);
		
		//to retrieve all the values
		
		for (int i = 0; i < scores.length; i++) {
		
		System.out.println(scores[i]);
		
		
		}
		
		//To print the lowest and highest
		//lowest//sort the array in ascending order - after sorting lowest number will be in the index 0
		
		//sort option available under Array class
		
		Arrays.sort(scores);
		
		System.out.println("the lowest value is: "+scores[0]);
		
		//Highest
		
		System.out.println("the highest value is: "+scores[4]);
		System.out.println(scores [arrayLength - 1]);
		
		//Array Instantiation - not required for automation just to understand the concepts 
		//I know the no.of data use Instantiation - in real time there are limitation in this that can be recitfied collecitons concepts
		
		int [] marks=new int[3];
		
		marks[0]=55;
		marks[1]=66;
		
		System.out.println(marks[1]);
		
			
		
		
		
	
		
		
		
	}

}
