package practice;

import java.util.Scanner;

public class Try3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number a:");
		int a=sc.nextInt(); 
		System.out.println("enter number b:");
		int b=sc.nextInt();
		System.out.println("enter number c:");
		int c=sc.nextInt();
		
		if(a>b) {
			if(a>c) 
			System.out.println("a is greater");
			else
			System.out.println("c is greater");
		}else {
			if(b>c)
			System.out.println("b is greater");
			else
		    System.out.println("c is greater");
		}


}
}
