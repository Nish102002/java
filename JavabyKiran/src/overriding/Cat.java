package overriding;

public class Cat extends Animal {
	   @override
        public void makesound() {
		   super.makesound();
        	System.out.println("meow");
        }
}
