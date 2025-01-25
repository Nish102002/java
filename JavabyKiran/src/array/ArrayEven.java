package array;
import java.util.Scanner;
public class ArrayEven {
         Scanner sc=new Scanner(System.in);
         
         public void acceptData(int E[]) {
        	 int count=0;
        	 while(count<E.length) {
        		 System.out.println("enter number:");
        		 int num=sc.nextInt();
        		 if(num%2==0) {
        			 E[count]=num;
        			 count++;
        		 }
        	 }
         }
         public void Display(int E[]) {
        	 System.out.println("value of Array:");
        	 for(int k=0; k<E.length; k++) {
        		 System.out.println(E[k]);
        	 }
         }
}
