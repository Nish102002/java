package exception;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 int age;
		
		try {
			System.out.println("enter age: ");
			age=sc.nextInt();
			
			if(age<0) {
          throw new AgeException("do not enter negative number");		
             }
			else if(age>=0 && age<=17) {
            throw new AgeException("you can not vote");
               }
			else if(age>=18 && age<=100) {
				throw new AgeException("you can vote");
			}
			else if(age>100){
		throw new AgeException("enter adharcard :");
			}
		}
		catch(AgeException e) {
         e.showerror();
		}
		
		
		
	}
	
}


