package exception;

public class Insufficient_Balance extends Exception {
	private String message=null;
	public Insufficient_Balance() {
		message="not applicable";
	}
	public Insufficient_Balance(String message) {
		this.message=message;
	}
	public void showerror() {
		System.out.println(this.message);
	}
}
