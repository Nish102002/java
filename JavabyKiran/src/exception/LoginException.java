package exception;

import java.util.Scanner;

public class LoginException extends Exception {
	 String message=null;
	public LoginException() {
		message="not applicable";
	}
	public LoginException(String message) {
		this.message=message;
	}
	public void showerror() {
		System.out.println(this.message);
	}
	
}
