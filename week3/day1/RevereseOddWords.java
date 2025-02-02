package week3.day1;

public class RevereseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] array = test.split(" ");
		/*for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}*/
		for (int j =0; j < array.length; j++ ) {
			if (j%2==0) {
				System.out.print(" "+array[j]+" ");
			}else {
				 				
				char[] ch = array[j].toCharArray();
				for (int k = ch.length-1; k >=0; k--) {
					
				System.out.print(ch[k]);
				
				
			}}
	
		}
	}
}
