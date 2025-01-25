package inheritance;
import java.util.Scanner;
public class Student extends Person {
 Scanner sc=new Scanner(System.in);
 
 
 private String stuname;
 private int roll_no;
 private int age;
 private String collage_name;
 private int english_marks;
 private int hindi_marks;
 private int phy_marks;
 private double percentage;
 private float total;
 
 
 //setters
  public void setname(String n) {
     stuname=n;
}
public void setage(int a) {
  age=a;
}
public void setroll_no(int b) {
	  roll_no=b;
	}
public void setcollage_name(String c) {
	  collage_name=c;
	}
public void setenglish_marks(int d) {
	english_marks=d;
	}
public void sethindi_marks(int e) {
	hindi_marks=e;
	}
public void setphy_marks(int f) {
	phy_marks=f;
	}



//getters
public String getname() {
	   return stuname;
}
public int getage() {
	   return age;
}
public int getroll_no() {
	   return roll_no;
}
public String getcollage_name() {
	   return collage_name;
}
public int getenglish_marks() {
	   return english_marks;
}
public int hindi_marks() {
	   return hindi_marks;
}
public int phy_marks() {
	   return phy_marks;
}



public void accept() {
	   
		System.out.println("Student name :");
		setname(sc.next());
		System.out.println("age :");
		setage(sc.nextInt());
		System.out.println("roll no :");
		setroll_no(sc.nextInt());
		System.out.println("collage_name :");
		setcollage_name(sc.next());
		System.out.println("english_marks :");
		setenglish_marks(sc.nextInt());
		System.out.println("hindi_marks :");
		sethindi_marks(sc.nextInt());
		System.out.println("phy_marks :");
		setphy_marks(sc.nextInt());
	
	}
   
   public void display() {
	  
   	System.out.println(" name: "+  stuname );
		System.out.println(" age: "+  age );
		System.out.println(" roll no: "+  roll_no );
		System.out.println(" collage name: "+  collage_name );
		System.out.println(" english marks: "+  english_marks );
		System.out.println(" hindi marks: "+  hindi_marks );
		System.out.println(" phy marks: "+  phy_marks );
		
   }
   public void getmarks() {
	   
	   total=english_marks+hindi_marks+phy_marks;
	   System.out.println();
        System.out.println("total:" +total);
	   
   }
   public void dopercen() {
 	  percentage=total/3;
 	  System.out.println();
 	  System.out.println("percentge : "+percentage);
    }
   Student(){
	   acceptperson(setname(),setage(),setgender());
	   accept();
	   display();
	   getmarks();
	   dopercen();
   }
  
}
