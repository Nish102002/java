package abstraction;

public class Cylinder extends CalVolume {
     private int radius;
     private int height;
     
     Cylinder(int radius,int height){
    	 this.radius=radius;
    	 this.height=height;
    	 CalculateVolume();
     }
     public void CalculateVolume() {
    	 double volume;
    	 volume=3.14*radius*radius*height;
    	 System.out.println("cylinder volume="+volume);
     }
}
