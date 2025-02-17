package Interface;

public class AllBird {
	public static void main(String[] args) {
		
		Bird B=new Koyal();
		ToyBird T=new WoodenKoyal();
		
		B.fly();
		B.sound();
		
		T.speak();
		
		Bird adaptedWoodenKoyal=new BirdAdapter(woodenKoyal);
		 adaptedWoodenKoyal.fly();
	        adaptedWoodenKoyal.sound();
		
	}

	

}
