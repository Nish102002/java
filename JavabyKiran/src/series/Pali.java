package series;
import java.util.Scanner;
public class Pali {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		
		int reverse=0,c;
		int reverseN;
		
		while(num>0) {
			c=num%10;
			reverse=reverse*10;
			num=num/10;
			
		}
		reverseN=reverse*num;
		if(num==reverseN) {
			System.out.println("number is pallindrome");
		}else {
			System.out.println("number is not pallindrome");
		}
	}

}
