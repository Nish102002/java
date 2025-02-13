package P4;
import java.util.Scanner;

import P1.Shape;
import P2.Rectangle;
import P3.Cicle;

public class mainShape {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		P1.Shape R=new Rectangle();
		Shape C=new Cicle();
	
		
		System.out.println("1 is for area of rectangle");
		System.out.println("2 is for area of circle ");
		
		System.out.println("enter choice: ");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1: R.area();
		break;
		
		case 2:C.area();
		break;
		default : System.out.println("enter valid choice ");
		
		}

	}

}
