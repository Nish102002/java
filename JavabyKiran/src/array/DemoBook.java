package array;

public class DemoBook {
      public static void main(String[] args) {
		Book b[]=new Book[5];
		
		Book B1=new Book();
		B1.enterInfo();
		B1.acceptInfo(b);
		B1.DisplayData(b);
	}
}
