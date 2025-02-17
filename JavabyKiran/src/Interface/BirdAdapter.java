package Interface;

public class BirdAdapter implements Bird {
	private ToyBird toyBird;
	
	public BirdAdapter(ToyBird toyBird) {
		this.toyBird=toyBird;
	}
   @Override
   public void fly() {
	   System.out.println("woooden koyal");
   }
   @Override
   public void sound() {
	   toyBird.speak();
   }
}
