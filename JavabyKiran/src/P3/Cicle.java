package P3;

import java.util.Scanner;

public class Cicle extends P1.Shape {
	Scanner sc=new Scanner(System.in);
	
	private int radius;
	private double area;
	
	@Override
	public void area() {
		System.out.println("enter radius : ");
		radius=sc.nextInt();
		area=radius*radius;
		System.out.println("area of circle: "+area);
	}

}
