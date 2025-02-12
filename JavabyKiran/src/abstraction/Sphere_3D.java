package abstraction;

import java.util.Scanner;

public class Sphere_3D extends Shape3D {
	Scanner sc=new Scanner(System.in);
	
	private int radius;
	private double volume,area;
	
	@Override
	void CalculateVolume() {
		System.out.println("enter radius : ");
		radius=sc.nextInt();
		volume=4/3*3.14*radius*radius*radius;
		System.out.println("volume of sphere : "+volume);
	}
	@Override
	void CalculateSurfaceArea() {
		area=4*3.14*radius*radius;
		System.out.println("area of sphere : "+area);
	}

}
