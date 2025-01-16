package array;
import java.util.Scanner;
public class ProSum {
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
    
    public static int squa(int y[]) {
    	int pro=1;
    	for(int k=0; k<y.length; k++) {
    	if(y[k]%2==0) {
    	 int a=y[k]*y[k]*y[k];
    	 pro*=a;
    	}
    }
    	return pro;
    }
}

