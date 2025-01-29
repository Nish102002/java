package method_overloading;

public class Ambiguity {
	public void amb(int d,double i) {
		
		
		System.out.println(d);
		System.out.println(i);
	}
	public void amb(double s,int j) {
		System.out.println(s);
		System.out.println(j);
	}

}
