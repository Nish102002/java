package overriding;

public class Cheetah extends Animal1 {
	@override
	public void move() {
		System.out.println("cheetah runs fast");
	}

}
