package inheritance;

public class Car extends Vehicle {
	private String carname, carbrand, carcolor;
	private int sitting_capacity;
	
	public void setname(String n) {
		carname=n;
	}
	public void setbrand(String b) {
		carbrand=b;
	}
	public void setcolor(String c) {
		carcolor=c;
	}
	public void setsitting_capacity(int s) {
		sitting_capacity=s;
	}
	
	public String name() {
		return carname;
	}
	public String brand() {
		return carbrand;
	}
	public String color() {
		return carcolor;
	}
	public int sitting_capacity() {
		return sitting_capacity;
	}

	
	public void acceptcar() {
		System.out.println("carname: ");
		setname(sc.next());
		System.out.println("carbrand: ");
		setbrand(sc.next());
		System.out.println("carcolor: ");
		setcolor(sc.next());
		System.out.println("sitting capacity: ");
		setsitting_capacity(sc.nextInt());
	}
	
	public void displaycar() {
		System.out.println("car name: "+carname);
		System.out.println("car brand: "+carbrand);
		System.out.println("car color: "+carcolor);
		System.out.println("car sitting capacity: "+sitting_capacity);
	}
	
	Car(){
		acceptcar();
		displaycar();
	}
	
     
}
