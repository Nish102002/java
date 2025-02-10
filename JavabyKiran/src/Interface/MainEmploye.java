package Interface;

public class MainEmploye {
	public static void main(String[] args) {
		Empolye E=new PartTime(22,13,500,"nish");
		String N=E.getDetails();
		System.out.println(N);
		Empolye E1=new FullTime(20000,3,"abc","xyz");
		String Nish=E1.getDetails();
		System.out.println(Nish);
	
	}

}
