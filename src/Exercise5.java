import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {
	
	/*
	Write a method called scaleByK that takes an ArrayList of integers as a parameter and replaces every integer of value k with k copies of itself.  
	For example if the list stores the values {4, 1, 2, 0, 3} before the method is called, it 
	should store the values {4, 4, 4, 4, 1, 2, 2, 3, 3, 3} after the method finishes executing.
	Zeroes and negative numbers should be removed from the list by this method 
	
	*/
	

	public static void main(String[] args) {

		List<Integer> listIntegers = new ArrayList<Integer>(Arrays.asList(4, 1, 2, 0, 3));
		
		listIntegers = new ArrayList<Integer>(Arrays.asList(-99, -22, 3, 4, 1, 2, 0, 3));
		
		System.out.println("list before expanding is:  " + listIntegers);
		
		listIntegers = scaleByK(listIntegers);
		
		System.out.println("list after expanding is:  " + listIntegers);
	}

	private static List<Integer> scaleByK(List<Integer> listIntegers) {
		List<Integer> scaledList = new ArrayList<Integer>();
		
		for(Integer elementValue: listIntegers ) {
			
			if(elementValue > 0) {
				System.out.println("element value is:  " + elementValue);
				for(int i=0; i < elementValue; i++) {
					scaledList.add(elementValue);
				}			
			}
		}
		//
		return scaledList;
		
	}

}
