package practice;
import java.util.Scanner;
public class Person {
	Scanner sc=new Scanner(System.in);
      private String name;
      private int age;
      
      public Person() {
    	acceptdata();
//    	  this.name="";
//    	  this.age=0;
      }
      
      public Person(String name, int age) {
     setname(name);
  	 setage(age);
//    	  this.name=name
      }
      public void setname(String n) {
    	  this.name=n;
      }
      public void setage(int a) {
    	 this.age=a;
      }
      
      public String getname() {
    	  return name;
      }
      public int getage() {
    	  return age;
      }
      
      public void acceptdata() {
    	  System.out.println("enter name: ");
    	  name=sc.next();
    	  System.out.println("enter age: ");
    	  age=sc.nextInt();
      }
      
      public void display() {
    	  System.out.println();
    	  System.out.println("person info_______");
    	  System.out.println("name: "+getname());
    	  System.out.println("age: "+getage());
      }
      
}
