package overriding;
import java.util.Scanner;
public class Circle extends Shape1 {
	Scanner sc=new Scanner(System.in);
	public void getPerimeter() {
		System.out.println("enter radius of circle: ");
		int radius=sc.nextInt();
		
		System.out.println("permeter of circle: "+ 2*radius*3.14);
	}
	public void getArea() {
		System.out.println("enter radius of circle: ");
		int radius1=sc.nextInt();
		System.out.println("area of circle: "+2*3.24*radius1*radius1);
	}

}
