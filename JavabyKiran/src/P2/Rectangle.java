package P2;

import java.util.Scanner;

public class Rectangle extends P1.Shape {
	Scanner sc=new Scanner(System.in);
     
	private int length,breadth;
	private double area;
	@Override
	public void area() {
		System.out.println("enter length : ");
		length=sc.nextInt();
		System.out.println("enter breadth : ");
		breadth=sc.nextInt();
		area=length*breadth;
		System.out.println("area of rectangle: "+area);
	}
}
