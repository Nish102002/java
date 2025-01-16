package day1;
import java.util.Scanner;

public class Book {
	String book_name;
	String author;
	int price;
	long quantity;
	long total;
	
	public Book(){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter book name:");
	book_name=sc.next();
	
	System.out.println("enter book author:");
	author=sc.next();
	
	System.out.println("enter book price:");
	price=sc.nextInt();
	
	System.out.println("enter book quantity:");
	quantity=sc.nextLong();
	
	System.out.println("enter book total:");  
	total=sc.nextLong();
		
	}
	
	public void display() {
		System.out.println("book name: "+ book_name);
    	System.out.println("book  author name: "+ author);
    	System.out.println("book price: "+ price);
    	System.out.println("book quantity: "+ quantity);
    	System.out.println("total: "+ total);
    	
	}
}
