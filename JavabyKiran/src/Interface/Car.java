package Interface;

public class Car implements Vehical{
	private String brand,model;
	private double daily_rent,rent;
	
	Car(String brand,String model,double daily_rent,double rent){
		this.brand=brand;
		this.daily_rent=daily_rent;
		this.model=model;
		this.rent=rent;
	}
	public double calculaterent(int days) {
		return rent=daily_rent*days;
	}
	public String getvehicle_type() {
		return "brand="+brand+" model"+model+" daily rent="+daily_rent+"total rent="+rent;
	}


}
