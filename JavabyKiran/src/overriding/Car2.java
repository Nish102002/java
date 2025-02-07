package overriding;

public class Car2 extends Truck {
	public String make; 
	public String model;
	public int year; 
	public String FuelType;

  public void fueleffciency() {
	  System.out.println("enter distance traveled by Car: ");
	  int distance=sc.nextInt();
	  System.out.println("enter fuel consumed by Car: ");
	  int fuel_consumed=sc.nextInt();
	  System.out.println("fuel efficiency of Car: "+distance/fuel_consumed);
  }
  public void distance_traveled() {
	  System.out.println("enter fuel consumed of Car: ");
	  int fuel_consumed=sc.nextInt();
	  System.out.println("fuel efficency of Car: ");
	  int fuel_efficiency=sc.nextInt();
	  System.out.println("distance traveled by Car: "+fuel_consumed*fuel_efficiency);
  }
  public void max_speed() {
	  System.out.println("enter maximum  speed of Car: ");
  }

}
