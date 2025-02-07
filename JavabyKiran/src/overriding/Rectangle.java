package overriding;

public class Rectangle extends Shape{
	@override
	public void getarea() {
		super.getarea();
		int l=10; int b=20;
		System.out.println("area of rectangle: "+l*b);
	}

}
