package sort;

public class DemoMax {
	public static void main(String[] args) {
		int y[]=new int[5];
		Max M1=new Max();
		
		M1.acceptValue(y);
		M1.DisplayValue(y);
		
//		int max=M1.getMax(y);
//		System.out.println("Max  "+max);
//		
//		int min=M1.getMin(y);
//		System.out.println("Min  "+min);
		
		int  secmax=M1.secmax(y);
		System.out.println("Second Max:  "+secmax);
		
		int  secmin=M1.secmin(y);
		System.out.println("Second Min:  "+secmin);
	}

}
