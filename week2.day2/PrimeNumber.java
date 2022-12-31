package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 16;
		boolean Prime = true;
		for (int i=2; i < num/2; i++) {
			if (num%i == 0) {
				
				Prime = false ;
				
					}}
		if (Prime) {
			System.out.println(num +" is a Prime number");
		}
		else
		{
			System.out.println(num + " is not a Prime number");

			
			}
		}
	}


