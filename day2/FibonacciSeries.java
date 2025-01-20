package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n =8;
		int firstnumber =0;
		int secondnumber =1;
		System.out.println(+firstnumber+" "+secondnumber);
		
		for (int i =3; i <=n; i++) {
		
			int nextnumber = firstnumber+secondnumber;
			System.out.println(" " +nextnumber);
			firstnumber=secondnumber;
			secondnumber=nextnumber;
			
		}
		

	}

}
