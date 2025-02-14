package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] n= {1, 2, 3, 4, 10, 6, 8};
		List<Integer> v1 = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			
			  v1.add(n[i]); // add to the list the array 
				
				}
		Collections.sort(v1);  // sorting in ascending order
		  System.out.println(v1);
		
		for (int j = 0; j < n.length; j++) {
			
			  if (n[j]!= j+1 ) {
				  System.out.println("Gap in the sequence" + v1.get(j));
			  }
			
			
		

	}

}
}
