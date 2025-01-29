package series;
import java.util.Scanner;
public class EvenorNot {
     public static void main(String[] args) {
		EvenorNot E1=new EvenorNot();
		E1.acceptdata();
		E1.even();		
	}
	int num=0;
     public void acceptdata() {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter number: ");
    	 num=sc.nextInt();
     }
     public void even() {
    	 if(num%2==0) {
    		 System.out.println("number is even "+num);
    	 }
     }
}
