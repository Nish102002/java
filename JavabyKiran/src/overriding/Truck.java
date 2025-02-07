package overriding;
import java.util.Scanner;
public class Truck extends Vehicle2{
	Scanner sc=new Scanner(System.in);
	public String make; 
	public String model;
	public int year; 
	public String FuelType;

  public void fueleffciency() {
	  System.out.println("enter distance traveled by Truck: ");
	  int distance=sc.nextInt();
	  System.out.println("enter fuel consumed by Truck: ");
	  int fuel_consumed=sc.nextInt();
	  System.out.println("fuel efficiency of Truck: "+distance/fuel_consumed);
  }
  public void distance_traveled() {
	  System.out.println("enter fuel consumed by Truck: ");
	  int fuel_consumed=sc.nextInt();
	  System.out.println("fuel efficency of Truck: ");
	  int fuel_efficiency=sc.nextInt();
	  System.out.println("distance traveled by Truck: "+fuel_consumed*fuel_efficiency);
  }
  public void max_speed() {
	  System.out.println("enter maximum  speed of Truck: ");
  }
}
