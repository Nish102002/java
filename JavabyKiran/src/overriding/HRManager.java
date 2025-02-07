package overriding;

public class HRManager extends Employee {
	@override
	void work() {
		super.work();
		System.out.println("work");
	}
	public void addEmployee() {
		System.out.println("employee");
	}

}
