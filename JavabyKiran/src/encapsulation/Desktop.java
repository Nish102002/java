package encapsulation;
import java.util.Scanner;
public class Desktop {
	Scanner sc=new Scanner(System.in);
	private String brand;
	private String processor;
	private String ramsize;
     String uram;
	
	public void setbrand(String n) {
		brand=n;
	}
	public void setprocessor(String m) {
		processor=m;
	}
	public void setramsize(String l) {
       ramsize=l;
	}

	public String getbrand() {
		return brand;
	}
	public String getprocessor() {
		return processor;
	}
	public String getramsize() {
		return ramsize;
	}
	
	
	
	public void upgraderam() {
		System.out.println("brand :");
		setbrand(sc.next());
		System.out.println("processor :");
		setprocessor(sc.next());
		System.out.println("ramsize :");
		setramsize(sc.next());
		System.out.println("enter size to upgarde ram :");
		uram = sc.next();
		
	}
	public void display() {
		System.out.println(" brand: "+  brand );
		System.out.println(" processor: "+  processor );
		System.out.println(" ramsize: "+  ramsize );
		System.out.println(" uram: "+  uram );
	}

}
