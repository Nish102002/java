package exception;

public class ClassNotFound {
    public static void main(String[] args) {
    	try {
    		Class.forName("exception.class");
    	}catch(ClassNotFoundException s) {
    		System.out.println(s);
    	}
		
	}
}
