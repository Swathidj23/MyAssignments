package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		int[] n1 = { 3, 2, 11, 4, 6, 7 };
		int[] n2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> v = new ArrayList<Integer>();//store array 1
		List<Integer> v1 = new ArrayList<Integer>();//store array 2 
		List<Integer> duplicate = new ArrayList<Integer>(); // store the duplicate values

		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n2.length; j++) {
				v.add(n1[i]);
				v1.add(n2[j]);
				if (n1[i] == n2[j]) { //compare array 1 values and array 2 values
					duplicate.add(n1[i]);  // add to duplicate array 
					

				}
			}
			
		}
		System.out.println("Duplicate Values are equal" + duplicate);// print the values
	}

}
