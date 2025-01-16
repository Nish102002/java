package practice;

import java.util.Scanner;

public class Try4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number a:");
		int a=sc.nextInt(); 
		
		if(a%3==0 && a%5==0) {
			System.out.println("Mango & orange");
		}else if(a%3==0) {
			System.out.println("mango");
		}else if(a%5==0) {
			System.out.println("orange");
		}else {
		System.out.println(a);
		}
	}
}
