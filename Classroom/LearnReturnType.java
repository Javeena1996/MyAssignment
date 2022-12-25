package week1.day1;

public class LearnReturnType {
	
	public void addtwoNumbers() {
		int a=5;
		int b=10;
		System.out.println(a+b);
	}

    public int addthreeNumbers(int a, int b, int c) {
	     return a+b+c;
	
}
    public boolean switchOff() {
    	return true;
    	
    }
	public static void main(String[] args) {
		LearnReturnType lr= new LearnReturnType();
		lr.addtwoNumbers();
		int result = lr.addthreeNumbers(30, 40, 50);
		System.out.println(result);
		boolean switchOff = lr.switchOff();
		System.out.println(switchOff);
	}

	}

