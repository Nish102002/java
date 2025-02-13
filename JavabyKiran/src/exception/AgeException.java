package exception;


public class AgeException extends Exception {
	private String message=null;
	public AgeException() {
		message="not applicable";
	}
	public AgeException(String message) {
		this.message=message;
	}
	public void showerror() {
		System.out.println(this.message);
	}
	
}
