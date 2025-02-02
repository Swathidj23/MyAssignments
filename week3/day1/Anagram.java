package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String input1 = "stops";
		String input2 ="potss";
		
		int length1 = input1.length();
		int length2 = input2.length();
		
		if (length1==length2) {
			char[] ch1 = input1.toCharArray();
			Arrays.sort(ch1);
			char[] ch2 = input2.toCharArray();
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2)) {
				System.out.println("The given string is Anagram");
			}else {
				System.out.println("The given string is not a Anagram");
			}
			
		}else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
		

	}

}
