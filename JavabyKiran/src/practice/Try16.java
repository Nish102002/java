package practice;
import java.util.Scanner;
public class Try16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		int count=0;
		
		System.out.println("enter a number:");
	    n=sc.nextInt();
        while (n!=0) {
        	n=n/10;
        	count++;
        }
        System.out.println(count);
	
	}
}
