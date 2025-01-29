package method_overloading;

public class Parameter {
	public void para(int a,String b,float c) {
		a=10;
		b="nish";
		c=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public void para(int d,long e) {
		d=40;
		e=50;
		System.out.println(d);
		System.out.println(e);
	}

}
