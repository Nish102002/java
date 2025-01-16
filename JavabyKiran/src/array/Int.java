package array;
import java.util.Scanner;
public class Int {
	Scanner sc=new Scanner(System.in);
	
//	public void reverse(int y[]) {
//		for(int k=y.length-1; k>=0; k--) {
//			System.out.println(y[k]);
//		}
//	}
	
	public int sum(int y[]) {
	int	sum=0;
		for(int k=0; k<y.length; k++) {
			sum=sum+y[k];
		}
		return sum;
	}
	
	public int product(int y[]) {
		int pro=1;
		for(int k=0; k<y.length; k++) {
			pro=pro*y[k];
		}
		return pro;
	}
	
	public int oddsum(int y[]) {
		int oddsum=0;
		for(int k=0; k<y.length; k++) {
			if (y[k]%2!=0) {
				oddsum=oddsum+y[k];
			}
			
		}
		return oddsum;
	}
//	public void DisplayValue(int y[]) {
//		System.out.println("Value from array");
//		for(int k=0; k<y.length; k++) {
//			System.out.println(y[k]);
//		}
//	}
   public void acceptValue(int y[]) {
	   System.out.println("Enter no.:");
	   for(int k=0; k<y.length; k++) {
		   y[k]=sc.nextInt();
	   }
   }
//   
//   
//   public void DisplayByte(byte a[]) {
//		System.out.println("Value from array");
//		for(int l=1; l<a.length; l++) {
//			System.out.println(a[l]);
//		}
//}
//   public void acceptByte(byte a[]) {
//	   System.out.println("Enter no.:");
//	   for(byte l=0; l<a.length; l++) {
//		   a[l]=sc.nextByte();
//	   }
//   }
//   
//   
//   
//   public void DisplayDouble(double b[]) {
//		System.out.println("Value from array");
//		for(int n=1; n<b.length; n++) {
//			System.out.println(b[n]);
//		}
//   }
//   public void acceptDouble(double b[]) {
//	   System.out.println("Enter no.:");
//	   for(int n=0; n<b.length; n++) {
//		   b[n]=sc.nextDouble();
//	   }
//   }
//   
//   
//   public void DisplayLong(long c[]) {
//		System.out.println("Value from array");
//		for(int m=1; m<c.length; m++) {
//			System.out.println(c[m]);
//		}
//  }
//  public void acceptLong(long c[]) {
//	   System.out.println("Enter no.:");
//	   for(int m=0; m<c.length; m++) {
//		   c[m]=sc.nextLong();
//	   }
//  }
//  
//  public void DisplayString(String e[]) {
//		System.out.println("Value from array");
//		for(int p=1; p<e.length; p++) {
//			System.out.println(e[p]);
//		}
//}
//public void acceptString(String e[]) {
//	   System.out.println("Enter no.:");
//	   for(int p=0; p<e.length; p++) {
//		   e[p]=sc.next();
//	   }
//}
//
//public void Evenint(int y[]) {
//	System.out.println("Enter value :");
//	for(int k=0; k<y.length; k++) {
//		if(y[k]%2==0) {
//			System.out.println(y[k]);
//		}
//	}
//	}
//	
//	public void Squaint(int y[]) {
//		System.out.println("Enter value :");
//		for(int k=0; k<y.length; k++) {
//	
//		System.out.println(y[k]*y[k]);
//		}
//		}	
//		
//		public void Cubeint(int y[]) {
//			System.out.println("Enter value :");
//			for(int k=0; k<y.length; k++) {
//		    if(y[k]%2!=0) {
//			System.out.println(y[k]*y[k]*y[k]);
//			
//			}	
//	
//	
//}
//   
//   
//}
	}
