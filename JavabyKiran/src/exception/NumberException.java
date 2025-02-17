package exception;

import java.util.Scanner;

public class NumberException extends Exception{
	
	private String message=null;
	public NumberException() {
		message="not applicable";
	}
	public NumberException(String message) {
		this.message=message;
	}
	public void showerror() {
		System.out.println(this.message);
	}
	
	

}
