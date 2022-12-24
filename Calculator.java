package week1.day1;

public class Calculator {

	public void addtwoNumbers() {
		int a=15;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		}

	public int addthreeNumbers(int a,int b,int c) {
			
		return a+b+c;

		}		
		public static void multiplytwoNumbers() {
			int a =5;
			double b =12;
			System.out.println(a*b);
		
		}
		
		public static int multiplytwoNumbers(int a,int b) {
			return a*b;
			
		}
		
		
		public static void subtracttwoNumbers() {
			double a =12;
			double b =50;
			System.out.println(a-b);
		}
		
		public static int subtracttwoNumbers(int a,int b) {
			return a-b;
		}
		
		
		public static void dividetwoNumbers() {
			double a = 90;
			int b = 9;
			System.out.println(a/b);
		}
		
			public static int dividetwoNumbers(int a,int b) {
			return a/b;
		}
		
		public static void main(String[] args) {
			
			Calculator cal = new Calculator();
			cal.addtwoNumbers();
			System.out.println(cal.addthreeNumbers(30, 40, 50));
			cal.multiplytwoNumbers();
			System.out.println(cal.multiplytwoNumbers(4, 6));
			cal.subtracttwoNumbers();
			System.out.println(cal.subtracttwoNumbers(10,6));
			cal.dividetwoNumbers();
			System.out.println(cal.dividetwoNumbers(72, 8));
					
		}
		
	}
