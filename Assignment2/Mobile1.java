package week1.day1;

public class Mobile1 {
	
	public void makeCall() {
		
		System.out.println("Call 944516630");
		
		String mobileModel= "vivo";
		float mobileWeight= 156.7f;
		
        System.out.println(mobileModel);
        
        System.out.println(mobileWeight);
	}
	
	
	public void sendMsg() {
		
		System.out.println("Have you received my call?");
		
		boolean fullyCharged= true;
		int mobileCost = 24500;
		
         System.out.println(fullyCharged);
         
         System.out.println(mobileCost);

	}
	

	public static void main(String[] args) {
		
		System.out.println("This is my Mobile");
		Mobile1 vivo = new Mobile1();
		
		vivo.makeCall();
		vivo.sendMsg();

	}
				
		}

