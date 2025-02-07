package overriding;

public class Motor_cycle extends Car2 {
	public String make; 
	public String model;
	public int year; 
	public String FuelType;

  public void fueleffciency() {
	  System.out.println("enter distance traveled by Motor Cycle: ");
	  int distance=sc.nextInt();
	  System.out.println("enter fuel consumed by Motor Cycle: ");
	  int fuel_consumed=sc.nextInt();
	  System.out.println("fuel efficiency of Motor Cycle: "+distance/fuel_consumed);
  }
  public void distance_traveled() {
	  System.out.println("enter fuel consumed by Motor Cycle: ");
	  int fuel_consumed=sc.nextInt();
	  System.out.println("fuel efficency of Motor Cycle: ");
	  int fuel_efficiency=sc.nextInt();
	  System.out.println("distance traveled by Motor Cycle: "+fuel_consumed*fuel_efficiency);
  }
  public void max_speed() {
	  System.out.println("enter maximum  speed of Motor Cycle: ");
  }

}
