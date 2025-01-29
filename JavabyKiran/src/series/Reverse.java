package series;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int r;
		System.out.println("enter number: ");
		int num=sc.nextInt();
		
		while(num>0) {
			r=num%10;
			System.out.print(r);
			num=num/10;
		}
		
	}

}
