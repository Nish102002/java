package abstraction;

public class MainAnimal {
	public static void main(String[] args) {
		
		Animal L=new Lion();
		Animal T=new Tiger();
		Animal D=new Dear();
		L.eat();
		L.sleep();
		T.eat();
		T.sleep();
		D.eat();
		D.sleep();
	}

}
