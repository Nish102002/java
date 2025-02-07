package overriding;

public class Car extends Vehical{
	@override
	public void drive() {
		super.drive();
		System.out.println("car");
	}

}
