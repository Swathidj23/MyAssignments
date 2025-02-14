package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int[] n1 = {3, 2, 11, 4, 6, 7}; // declare array 
		List<Integer> v1 = new ArrayList<Integer>();// store to the list
		for (int i = 0; i < n1.length; i++) {
		  v1.add(n1[i]); // add to the list the array 
		}
		
		Collections.sort(v1);  // sorting in ascending order
		System.out.println(v1);
		int largest = v1.get(4); // store the 2nd largest to a variable
		System.out.println("second largest number "+largest); // print secodn largest
		

	}

}
