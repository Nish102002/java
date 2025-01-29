package array;

import java.util.Scanner;

public class TwoDimen {
	public void acceptValue(int y[][]) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no.:");
		for (int k = 0; k < y.length; k++) {
			for(int j=0; j<y[k].length; j++) {
			y[k] [j]= sc.nextInt();
			}
	}
	}
		public void DisplayValue(int y[][]) {
			System.out.println("Value from array");
			for (int k = 0; k < y.length; k++) {
				for(int j=0; j<y[k].length; j++) {
					System.out.println(y[k] [j]+"  ");
				}
				System.out.println();
			}
		}
		public void sum(int x[][],int y[][],int z[][]) {
			for(int k=0; k<y.length; k++) {
				for(int j=0; j<y[k].length;j++) {
					z[k][j]=y[k][j]+x[k][j];
				}
			}
		}
		public void sub(int x[][],int y[][],int z[][]) {
			for(int k=0; k<y.length; k++) {
				for(int j=0; j<y[k].length;j++) {
					z[k][j]=y[k][j]-x[k][j];
				}
			}
		}
}
