package array;

public class DemoProSum {
	public static void main(String[] args) {
		ProSum P1=new ProSum();
		int y[]=new int[5];
		
		P1.Accept(y);
		P1.Display(y);
		int pro=P1.squa(y);
		System.out.println(pro);
	}

}
