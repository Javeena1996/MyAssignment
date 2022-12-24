package week1.day1;

public class Mobile1 {
	
	public void makeCall() {
		String mobileModel= "Vivo";
		
		float mobileWeight= 156.7f;
		
        System.out.printf(mobileModel);
        
        System.out.println(mobileWeight);
	}
	
	
	public void sendMsg() {
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

