package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		boolean b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter boolean value ");
		
		
		try {
			b=sc.nextBoolean();
			System.out.println(b);
		}catch(InputMismatchException i) {
			System.out.println(i);
		}
		System.out.println("done");
	}

}
