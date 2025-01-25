package array;

public class DemoTwoDimen {
	public static void main(String[] args) {
		int y[][]=new int[3][3];
		int z[][]=new int [3][3];
		int x[][]=new int [3][3];
		
		
		TwoDimen T1=new TwoDimen();
		
		T1.acceptValue(y);
		T1.acceptValue(x);
		T1.DisplayValue(y);
		T1.DisplayValue(x);
		int a=10; int b=20;
		int c=a+b;
		System.out.println();
//		T1.sum(x, y, z);
		T1.sub(x,y,z);
		T1.DisplayValue(z);
	}

}
