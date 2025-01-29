package series;
import java.util.Scanner;
public class Minnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number: ");
		int num1=sc.nextInt();
		System.out.println("enter number: ");
		int num2=sc.nextInt();
		System.out.println("enter number: ");
		int num3=sc.nextInt();
		
		int min=num1;
		if(min>num2) {
			min=num2;
		}if(min>num3) {
			min=num3;
		}
		System.out.println("minimum number : "+min);
	}

}
