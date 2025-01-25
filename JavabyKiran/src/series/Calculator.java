package series;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	
	double num1 , num2;
	public void accept() {
		System.out.println("enter num 1 :");
		num1 = sc.nextDouble();
		System.out.println("Enter num 2 :");
		num2 = sc.nextDouble();
	}
	
	public void sum() {
		double sum;
		sum=num1+num2;
		System.out.println("sum:"+sum);
	}
	public void subtraction() {
		double sub;
		sub=num1-num2;
		System.out.println("subtraction: "+sub);
	}
	public void multiplication() {
		double mul;
		mul=num1*num2;
		System.out.println("multiplication:"+mul);
	}
	public void division() {
		double div;
		div=num1/num2;
		System.out.println("division :"+div);
	}
	public void modulus() {
		double mod;
		mod=num1%num2;
		System.out.println("modulus :"+mod);
	}
	
	public void logic() {
		
		System.out.println("Choices are as Follows :");
		System.out.println("Choice 1 for Addition");
		System.out.println("Choice 2 for Substraction");
		System.out.println("Choice 3 for Multiplication");
		System.out.println("Choice 4 for Division");
		System.out.println("Choice 5 for Modulous");
		
		System.out.println();
		System.out.println("Enter choice: ");
		int num=sc.nextInt();
		
		switch(num) {
		case 1:sum();
		break;
		
		case 2:subtraction();
		break;
		
		case 3:multiplication();
		break;
		
		case 4:division();
		break;
		
		case 5:modulus();
		break;
		
		default:System.out.println("Enter valid number");
		
	
	}
	}
}

