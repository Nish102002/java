package pattern;

public class P10 {
	public static void main(String[] args) {
		int sp=5;
		for(int r=1; r<=5; r++) {
			char ch='A';
			for(int s=1; s<=(sp-r); s++) {				
				System.out.print(" ");
			}for(int c=1; c<=r; c++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println( );
			
		}
	}

}
