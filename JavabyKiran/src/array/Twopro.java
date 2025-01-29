package array;
import java.util.Scanner;
public class Twopro {
	public static void main(String[] args) {
		int y[][]=new int[3][3];
		int x[][]=new int[3][3];
		int z[][]=new int[3][3];
		Twopro T1=new Twopro();
	    T1.acceptdata(y);
	    T1.acceptdata(x);
	    T1.showdata(y);
	    T1.showdata(x);
	    T1.arrayproduct(x, y, z);
	    T1.showdata(z);
	}
	
	public void arrayproduct(int x[][],int y[][],int z[][]) {

		for(int i=0; i<y.length; i++ ) {
			for(int j=0; j<y.length; j++) {
			 for(int k=0; k<y.length; k++) {
				 z[i][j]+=y[i][k]*x[k][j];
			 }
			}
		}
	}
	
	public void showdata(int y[][]) {
		System.out.println("value from Array");
		for(int k=0; k<y.length; k++) {
			for(int j=0; j<y[k].length; j++) {
				System.out.println(y[k][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void acceptdata(int y[][]) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		for(int k=0; k<y.length; k++) {
			for(int j=0; j<y[k].length; j++) {
				y[k][j]=sc.nextInt();
			}
		}
	}

}
