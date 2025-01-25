package homework;

public class Prime {
	public void acceptPrime(int y[]) {
		 int count=0;
		 while(count<y.length){
			  System.out.println("enter number:");
			  int num=sc.nextInt();
			  if(isPrime(num)) {
				y[count]=num;
    			count++;
			  }
		  }
		
		}
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<=num/2 ; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	    public void nish(int y[]) {
	    	int count=0;
	    	while(count<5) {
	    		System.out.println("enter number:");
				  int num=sc.nextInt();
				  if(num%1==0 || num%num==0) {
					y[count]=num;
	     			count++;
				  }
	    		
	    	}
	    }
	    
		 
}
