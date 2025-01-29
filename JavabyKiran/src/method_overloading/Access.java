package method_overloading;

public class Access {
	public void modifer(int a,String b) {
		a=10;
		b="nish";
		System.out.println(a);
		System.out.println(b);
	}
	final void modifier(String n,int c) {
		n="girish";
		c=278;
		System.out.println(n);
		System.out.println(c);
	}
        // different retrun type//
	public void ret(float z,long c) {
		z=3000;
		c=2000;
		System.out.println(z);
		System.out.println(c);
	}
	public double ret (double z) {
	        
		return z;
	}
	 //mixture of data type and parameter//
	
	public void data(int k) {
		System.out.println(k);
	}
	public void data(String b, double d) {
		System.out.println(b);
		System.out.println(d);
	}
	
	// changing number of data type and parameter//
	
	public void para(int var) {
		System.out.println(var);
	}
	public void para(String n,float f) {
		System.out.println(n);
		System.out.println(f);
	}
}
