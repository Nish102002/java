package abstraction;

public class Cube extends CalVolume{
        private float edge;
        
        Cube(float edge){
        	this.edge=edge;
        	CalculateVolume();
        }
     
        @Override
     public void CalculateVolume() {
    	 float  volume;
    	 volume=edge*edge*edge;
    	 System.out.println("cube volume="+volume);
     }
}
