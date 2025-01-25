package sort;
import java.util.Scanner;
public class Max {
	
	public int secmax(int y[]) {
		for(int k=0; k<y.length; k++) {
			for(int j=k+1; j<y.length; j++) {
				if(y[k]<y[j]) {
					int t=y[k];
					y[k]=y[j];
					y[j]=t;
				}
			}
		}
		return y[1];
	}
	
	public int secmin(int y[]) {
		for(int k=0; k<y.length; k++) {
			for(int j=k+1; j<y.length; j++) {
				if(y[k]>y[j]) {
					int t=y[k];
					y[k]=y[j];
					y[j]=t;
				}
			}
		}
		return y[1];
	}    
	
	public int getMax(int y[]) {
		int max=y[0];
		for(int k=0; k<y.length;k++) {
			if(max<y[k])
				max=y[k];
		}
		return max;
	}
	
	public int getMin(int y[]) {
		int min=y[0];
		for(int k=0; k<y.length;k++) {
			if(min>y[k])
				min=y[k];
		}
		return min;
	}

	
	public void acceptValue(int y[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no.:");
		for (int k = 0; k < y.length; k++) {
			y[k] = sc.nextInt();
		}
	}
	
	
	public void DisplayValue(int y[]) {
		System.out.println("Value from array");
		for (int k = 0; k < y.length; k++) {
			System.out.println(y[k]);
		}
	}
}
