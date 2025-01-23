package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int number = 7;
		int  conditionsatifies= 0; // to check if the number%i condition is pass or not
		for (int i = 2; i < number; i++) {
			if ((number % i == 0)) {
				conditionsatifies++;// if the condition is pass, then we need to increment the condition, so that this loop breaks and print the else defined at line16 
				System.out.println(" : is a not Prime number");
				break;
			}

		}
		if (conditionsatifies == 0) {
			System.out.println(" : is a Prime number");
		}
	}
}
