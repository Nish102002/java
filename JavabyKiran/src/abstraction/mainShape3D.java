package abstraction;

public class mainShape3D {
	public static void main(String[] args) {
		Shape3D S=new Sphere_3D();
		Shape3D C=new Cube3D();
		
		
		S.CalculateVolume();
		S.CalculateSurfaceArea();
		C.CalculateVolume();
		C.CalculateSurfaceArea();
	}

}
