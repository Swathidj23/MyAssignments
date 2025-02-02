package week3.day1;

public class RemoveDuplicates {

	

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] word = text.split(" ");
		for (int i = 0; i < word.length; i++) {
			for (int j = i+1; j < word.length; j++) {
				
				if (word[i].equals(word[j])) {
					
					
					word[i] = "";
					word[j] = "";
					
					
				}
				
			}
		}
			for (int count = 0; count < word.length; count++) {
				System.out.print( word[count]+" ");
			}
		}
}
		
