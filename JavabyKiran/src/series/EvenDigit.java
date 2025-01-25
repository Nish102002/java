package series;
import java.util.Scanner;
public class EvenDigit {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter no:");
		  int num=sc.nextInt();
		  while (num!=0) {
		  int digit=num%10;
		  if(digit%2==0) {
			System.out.println(digit);  
		  }num/=10;
	}
      }
}
