package array;

public class DemoEmploye {
	public static void main(String[] args) {
		Employe E1[] =new Employe[5];
		
		Employe E2=new Employe();
		E2.acceptData(E1);
		E2.DisplayData(E1);
		System.out.println();
		E2.sortData(E1);
		E2.DisplayData(E1);
	
	}

}
