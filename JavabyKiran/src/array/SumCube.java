package array;
import java.util.Scanner;
public class SumCube {
     Scanner sc=new Scanner(System.in);
     
    public void Accept(int y[]) {
    	System.out.println("Enter no:");
    	for(int k=0; k<y.length; k++) {
    		y[k]=sc.nextInt();
    	}
    }
    
    public void Display(int y[]) {
    	System.out.println("Value of array");
    	for(int k=0; k<y.length; k++) {
          System.out.println(y[k]+" ");
    	}
    	System.out.println();
    }
    
    public static int Cube(int y[]) {
    	int sum=0;
    	for(int k=0; k<y.length; k++) {
        int c=y[k]*y[k]*y[k];
        sum +=c;
    		
    	}
    	return sum;
    }
    
}
