package week1.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		int num = 34343;
		int pNum = num;
		int sum, rem = 0;
		
		for (sum = 0; num > 0; num/=10) {
			rem = num/10;
			sum = (sum*10)+rem;
		}
		if (pNum ==sum)
			System.out.println(pNum + "is a Palindrome number");
		else
			System.out.println(pNum+ "is not a palindrome number");
		}
	}


