package series;
import java.util.Scanner;
public class CubeDigit {
    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number: ");
		int num=sc. nextInt();
		
		int reverse=0;
		int temp=num;
		
		while(temp!=0) {
			reverse=reverse*10+temp%10;
			temp/=10;
		}
		while(reverse!=0) {
			int digit=reverse%10;
		System.out.println("digit: "+digit+ " cube: " +digit*digit*digit);
		reverse/=10;
	}
    }
}
