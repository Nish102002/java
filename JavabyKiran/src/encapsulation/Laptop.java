package encapsulation;
import java.util.Scanner;
public class Laptop {
	Scanner sc=new Scanner(System.in);
	private String brand;
	private String processor;
	private String ramsize;
	
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
	
	Laptop(){
		accept();
		display();
	}
	Laptop(String n,String m, String l){
		 n=brand;
		 m=processor;
		 l=ramsize;
	}
	public void accept() {
		System.out.println("brand :");
		setbrand(sc.next());
		System.out.println("processor :");
		setprocessor(sc.next());
		System.out.println("ramsize :");
		setramsize(sc.next());
	}
    public void display() {
    	System.out.println(" brand: "+  brand );
		System.out.println(" processor: "+  processor );
		System.out.println(" ramsize: "+  ramsize );
    }
   
}
