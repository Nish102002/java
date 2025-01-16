package encapsulation;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner (System.in);
	private String student_name;
	private String collage_name;
	private  long mobile_no; 
	
	public String getstudentname() {
		return student_name;
	}
	public String getcollagename() {
			return collage_name;
		}
	public long mobile() {
				return mobile_no;
	}
		public void acceptdetail() {
				System.out.println("student name :");
				student_name=sc.next();
				System.out.println("collage name :");
				collage_name=sc.next();
				System.out.println("mobile :");
				mobile_no=sc.nextLong();
				
			}
		public void display() {
		System.out.println("student name: "+ student_name );
		System.out.println("collage name: "+ collage_name );
		System.out.println("mobile: "+ mobile_no );
		}
}
	