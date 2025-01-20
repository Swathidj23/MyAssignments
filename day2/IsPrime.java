package week1.day2;

public class IsPrime {
	
	public static void main(String[] args) {
		int number = 15;
		for (int i = 2; i < number; i++) {
			if((i%number ==0)){
				System.out.println(i+" : is a not Prime number");
			}else
			{
				System.out.println(i+" : is a  Prime number");	
			}
			
		}
	}
}

