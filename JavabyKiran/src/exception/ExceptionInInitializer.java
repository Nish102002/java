package exception;

public class ExceptionInInitializer {
	public static void main(String[] args) {
		 int a=12/0;
		try {
			System.out.println(a);
		}catch(ExceptionInInitializerError e) {
			System.out.println(e);
		}
	}

}
