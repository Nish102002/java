package practice;

import java.util.Scanner;

public class Try1 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter number :");
		int a=sc.nextInt();
		System.out.println(a);
		if (a%3==0 && a%5==0) {
			System.out.println(" is divisible by 3 & 5");
		}else {
		   System.out.println(" is not divisible by both");
		}
	}

}
