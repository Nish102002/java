package practice;
import java.util.Scanner;
public class Try2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter percentage:");
		double b=sc.nextDouble();
		System.out.println(b);
		
		if (b>75) {
			System.out.println("A1");
		}else if (b>=65) {
			System.out.println("B1");
		}else if (b>=55) {
			System.out.println("C1");
		}else if(b>=45) {
			System.out.println("D1");
		}
		
		
	}

}
