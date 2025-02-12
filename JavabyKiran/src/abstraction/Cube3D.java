package abstraction;

import java.util.Scanner;

public class Cube3D extends Shape3D {
	Scanner sc=new Scanner(System.in);
	
	private int edge;
	private double volume,area;
	
	@Override
	void CalculateVolume() {
		System.out.println("enter egde : ");
		edge=sc.nextInt();
		volume=edge*edge*edge;
		System.out.println("volume of cube : "+volume);
	}
	@Override
	void CalculateSurfaceArea() {
		area=6*edge*edge;
		System.out.println("area of cube : "+area);
	}
	

}
