package array;
import java.util.Scanner;
public class Book {
      private String name;
      private String author_name;
      private int price;
      private long quantity;
      private long total;
      
      public void enterInfo() {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("enter name:");
    	  name=sc.next();
    	  System.out.println("enter author name:");
    	  author_name=sc.next();
    	  System.out.println("enter price:");
    	  price=sc.nextInt();
    	  System.out.println("enter quantity:");
    	  quantity=sc.nextLong();
    	  System.out.println("enter total:");
    	  total=sc.nextLong();
      }
      
      public void acceptInfo(Book B[]) {
    	  for(int b=0; b<B.length; b++) {
    		  B[b]=new Book();
    		  B[b].enterInfo();
    	  }
      }
      
      public void DisplayData(Book B[]) {
    	   for(int a=0; a<B.length; a++) {
    		   B[a].ShowData();
    	   }
       }
      
      public void ShowData() {
    	  System.out.println("enter name:"+name);
    	  System.out.println("enter author name:"+author_name);
    	  System.out.println("enter price:"+price);
    	  System.out.println("enter quantity:"+quantity);
    	  System.out.println("enter total:"+total);
      }
}
