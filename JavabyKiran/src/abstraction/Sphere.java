package abstraction;

public class Sphere extends CalVolume{
	private int radius;
	
	Sphere(int radius){
		this.radius=radius;
		CalculateVolume();
	}
	@Override
	public void CalculateVolume() {
		double volume;
		volume=1.33*3.14*radius*radius*radius;
		System.out.println("sphere volume="+volume);
	}

}
