package homework;
import java.util.Scanner;
public class Geometry {
	
	Scanner sc=new Scanner(System.in);
	float pi=3.14f;
	
	public void circle() {
		System.out.println("enter radius: ");
		double r=sc.nextDouble();
		
		double carea=pi*r*r;
		System.out.println("carea: "+ carea);	
	}
	public void rectangle() {
		System.out.println("enter length: ");
		double l=sc.nextDouble();
		System.out.println("enter breadth: ");
		double b=sc.nextDouble();
		
		double rarea=l*b;
		System.out.println("rarea: "+ rarea);	
	}
	public void square() {
		System.out.println("enter side: ");
		double s=sc.nextDouble();
		double sarea=s*s;
		System.out.println("sarea: "+ sarea);	
	}
	public void triangle() {
		System.out.println("enter height: ");
		double h=sc.nextDouble();
		System.out.println("enter breadth: ");
		double b=sc.nextDouble();
		
		double tarea=(h*b)*1/2;
		System.out.println("tarea: "+ tarea);	
	}
 public void choice() {
	 System.out.println("enter choice: ");
		int a=sc.nextInt();
	switch (a) {
	case 1:
		circle();
		break;
	case 2:
		rectangle();
		break;
	case 3:
		square();
		break;
	case 4:
		triangle();
		break;
	default:
		System.out.println("enter valid choice");
	}
	
 }	

}
