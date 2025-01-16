package encapsulation;
import java.util.Scanner;
public class House {
	Scanner sc=new Scanner(System.in);
	private String address;
	private int noofroom;
	private double area;
	private double price;
	private double rate;
	
	public void setaddress(String n) {
		address=n;
	}
	public void setnoofroom(int m) {
		noofroom=m;
	}
	public void setarea(double l) {
		area=l;
	}
	public void setprice(Double j) {
		price=j;
	}
	public void setrate(double k) {
		rate=k;
	}

	
	public void acceptdetail() {
		System.out.println("address :");
		setaddress(sc.next());
		System.out.println("noofroom :");
		setnoofroom(sc.nextInt());
		System.out.println("area :");
		setarea(sc.nextDouble());
		System.out.println("price :");
		setprice(sc.nextDouble());
		System.out.println("rate :");
		setrate(sc.nextDouble());
		
	}
		public void display() {
			System.out.println(" address: "+  address );
			System.out.println(" noofroom: "+  noofroom );
			System.out.println(" area: "+  area );
			System.out.println(" price: "+  price );
			System.out.println(" rate: "+  rate );
			System.out.println(price=rate*area);
		}
	}
	


