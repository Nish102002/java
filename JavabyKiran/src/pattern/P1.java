package pattern;

public class P1 {
       public static void main(String[] args) {
    	   for(int k=1; k<=5; k++) {
    		   for(int j=1; j<=5; j++) {
    			   if(k==3 || j==3) {
    				 System.out.print("#");
    			   }else {
    				   System.out.print("*");
    			   }
    		   }
    		   System.out.println( );
    	   }
       }
}
