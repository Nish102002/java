package exception;

import java.lang.ArithmeticException;
public class ArithmaticException {
	
	public static void main(String[] args) {
		try {
			System.out.println("line 1");
			System.out.println(12/0);
			System.out.println("line 2");
		}catch(ArithmeticException a) {
			System.out.println(a);
		}
	}

}
