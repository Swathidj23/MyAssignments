package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		
		for (int j =0; j < ch.length; j++ ) {
			if (j%2==0) {
				System.out.print(""+ch[j]);
			}else {
				char A = ch[j];
				ch[j]= Character.toUpperCase(A);
				System.out.print(""+ch[j]);
				
			}
	
		}
	}

	}


