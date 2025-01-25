package inheritance;
import java.util.Scanner;
public class Person {
	Scanner sc=new Scanner(System.in);
       private String name;
       private int age;
       private String  gender;
     
       
       public void getname(String n) {
    	      name=n;
       }
       public void getage(int a) {
    	   age=a;
       }

       public void getgender(String b) {
    	   gender=b;
       }
       
       public String setname() {
    	   return name;
       }
       public int setage() {
    	   return age;
       }
       public String setgender() {
    	   return gender;
       }
       
      
       
       
       public void acceptperson(String n,int a,String b) {
   		System.out.println("name :");
   		name=(sc.next());
   		System.out.println("age :");
   		age=(sc.nextInt());
   		System.out.println("gender :");
   		gender=(sc.next());
   	
   	}
       
       public void displayperson() {
       	System.out.println(" name: "+  name );
   		System.out.println(" age: "+  age );
   		System.out.println(" gender: "+ gender );
   		
       }
       Person(){
    	   
       }
}
