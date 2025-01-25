package array;

import java.util.Scanner;

public class Student {
       private String name;
       private int id;
       private int roll_no;
       
       
       public static void sortData(Student S1[]) {
    	   for(int a=0; a<S1.length; a++) {
    		   for(int j=0; j<S1.length; j++) {
    			   if(S1[a].roll_no>S1[j].roll_no) {
    				   Student t=S1[a];
    				   S1[a]=S1[j];
    				   S1[j]=t;
    			   }
    		   }
    	   }
       }
       
       public void enterInfo() {
   		Scanner sc=new Scanner(System.in);
   		System.out.println("enter name: ");
   		name=sc.next();
   		System.out.println("enter id:");
   		id=sc.nextInt();
   		System.out.println("enter roll no: ");
   		roll_no=sc.nextInt();
   		
   	}
       
       public static void acceptData(Student S1[]) {
   		for(int a=0; a<S1.length; a++) {
   			S1[a]=new Student();
   			S1[a].enterInfo();
   		}
   	}
       
       public static void DisplayData(Student S1[]) {
    	   for(int a=0; a<S1.length; a++) {
    		   S1[a].ShowData();
    	   }
       }
       
       public void ShowData() {
    	System.out.println("      ");
   		System.out.println("name: "+name);
   		System.out.println("id: "+id);
   		System.out.println("roll no: "+roll_no);
   	}
       
}
