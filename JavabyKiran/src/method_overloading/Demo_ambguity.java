package method_overloading;

public class Demo_ambguity {
	public static void main(String[] args) {
		double s=33.2;
		
		Ambiguity A1=new Ambiguity();
		
		A1.amb(9, 9.9);
		A1.amb((double)5, 5);
	}
	
	

}
