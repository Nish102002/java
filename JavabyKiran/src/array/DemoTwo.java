package array;

public class DemoTwo {
	public static void main(String[] args) {
		int y[][]=new int[3][3];
		int x[][]=new int[3][3];
		int z[][]=new int[3][3];
		Twopro T1=new Twopro();
	    T1.acceptdata(y);
	    T1.acceptdata(x);
	    T1.showdata(y);
	    T1.showdata(x);
	    T1.arrayproduct(x, y, z);
	    T1.showdata(z);
		
	}

}
