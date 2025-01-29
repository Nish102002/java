package method_overloading;

public class DataType {
	public void data(int a) {
		a=10;
		System.out.println(a);
	}
	public void data(String b) {
		b="nishchal";
		System.out.println(b);
	}
	
	//different data types and common parameter//
	public void commonpara(int x,float y) {
		x=56;
		y=300;
		System.out.println(x);
		System.out.println(y);
	}
	public void commonpara(String z,long g) {
		z="sans";
		g=2000;
		System.out.println(z);
		System.out.println(g);
	}
	// different order of parameter//
	
	public void order(int f,char k) {
		
		System.out.println(f);
		System.out.println(k);
	}
	public void order(char j, int h) {
		
		System.out.println(j);
		System.out.println(h);
	}

}
