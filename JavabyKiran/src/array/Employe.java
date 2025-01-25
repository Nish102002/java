package array;

import java.util.Scanner;

public class Employe {
	Scanner sc=new Scanner(System.in);
	private String name;
    private	String post;
	long salary;
	
	public static void sortData(Employe E1[]) {
 	   for(int a=0; a<E1.length; a++) {
 		   for(int j=0; j<E1.length; j++) {
 			   if(E1[a].salary>E1[j].salary) {
 				   Employe t=E1[a];
 				   E1[a]=E1[j];
 				   E1[j]=t;
 			   }
 		   }
 	   }
    }
	public void enterInfo(Employe E1[]) {
		
		System.out.println("enter name: ");
		name=sc.next();
		System.out.println("enter post:");
		post=sc.next();
		System.out.println("enter salary: ");
		salary=sc.nextLong();
		
	}
	
	public void acceptData(Employe E1[]) {
		for(int i=0 ; i<E1.length; i++) {
			E1[i]=new Employe();
			E1[i].enterInfo(E1);
			
		}
	}
	
	public void DisplayData(Employe E1[]) {
 	   for(int a=0; a<E1.length; a++) {
 		   E1[a].ShowData();
 	   }
    }
	
	public void ShowData() {
		System.out.println("name: "+name);
		System.out.println("post: "+post);
		System.out.println("salary: "+salary);
	}
	
}
