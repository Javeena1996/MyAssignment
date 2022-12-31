package week1.day2;

public class Factorial {
	
  public static void main(String[] args) {
	int value=5;
	int fact=1;
	
	for (int i = value; i>=1; i-- ) {
		
		fact=fact*i;
	}
	
				System.out.println(fact);
		
	}
}
