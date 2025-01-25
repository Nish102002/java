package sort;

public class DemoBubble {
     public static void main(String[] args) {
    	 int y[]=new int[5];
		 Bubble B1=new Bubble();
		 
		 B1.acceptValue(y);
		 B1.DisplayValue(y);
		 B1.sort_1(y);
		 System.out.println("Ascending: ");
		 B1.DisplayValue(y);
		 B1.sort_2(y);
		 System.out.println("Dsecending: ");
		 B1.DisplayValue(y);
	}
}
