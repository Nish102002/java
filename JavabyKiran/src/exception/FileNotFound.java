package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound extends Exception {
	
	
	private String message=null;
	public FileNotFound() {
		message="not applicable";
	}
	public FileNotFound(String message) {
		this.message=message;
	}
	public void showerror() {
		System.out.println(this.message);
	}
	
	
   public static void main(String[] args) {
	   try {
		   System.out.println("line 1");
			FileReader r=new FileReader("nish.pdf");
			System.out.println("line 2");
		}catch(FileNotFoundException f) {
			System.out.println(f);
		}
	   
}
}
