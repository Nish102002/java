package pattern;

public class P9 {
	public static void main(String[] args) {
		 int sp=5;
		 
		 for(int r=1; r<=5; r++) {
			 int a=1;
			 for(int k=1; k<=(sp-r); k++) {
				 System.out.print(" ");
			 } for(int c=1; c<=r; c++) {
				 System.out.print(c);
				 a++;
			 }
			 System.out.println( );
		 }
	}

}
