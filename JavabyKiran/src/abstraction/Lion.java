package abstraction;

public class Lion extends Animal {
	@Override
	void eat() {
		System.out.println("non-veg");
	}
    void sleep() {
    	System.out.println("10 hrs");
    }
}
