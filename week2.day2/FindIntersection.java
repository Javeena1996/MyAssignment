package week1.day2;

public class FindIntersection {
	
	public static void main(String[] args) {
		int arg1[] = {3,2, 11,4,6,7};
		int arg2[] = {1,2,8,4,9,7};
		
		System.out.println("Common number from both the Arrays: ");
		
		for (int i = 0; i<arg1.length; i++) {
			
			
			for (int j=0; j<arg2.length; j++) {
				
			if (arg1[i] == arg2[j])
				
			{
				System.out.println(arg1[i] + " ");
			}
			
			}
			}
	}

}
