package Interface;

public class MainVehicle {
	public static void main(String[] args) {
		Vehical v=new Bike("swift","bhh",200.0,300);
		v.calculaterent(45);
		String nish=v.getvehicle_type();
		System.out.println(nish);
		
		Vehical V=new Car("swift","bhh",200.0,300);
		V.calculaterent(36);
		String n=V.getvehicle_type();
		System.out.println(n);
     		
	}

}
