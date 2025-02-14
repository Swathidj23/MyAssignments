package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {



	public static void main(String[] args) {
		String[] n1 =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> v1 = new ArrayList<String>();
		
		for (int i =0; i<n1.length; i++) {
			v1.add(n1[i]);  //add to List
			
		}
		System.out.println("List is "+v1);
		 
       Collections.sort(v1);  //sort the list
       System.out.println("Sorted List is " +v1);
       Collections.reverse(v1); // reverse sort the list
       System.out.println("Reverse Sorted List" +v1);
       
	}

}
