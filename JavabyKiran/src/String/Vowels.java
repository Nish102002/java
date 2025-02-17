package String;

public class Vowels {
	public static void main(String[] args) {
		String S1=" nishchal girish Chaudahiri";
		int count=0,k=0;
		while(k<S1.length()) {
			char ch=S1.charAt(k);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println(ch);
			k++;
			
		}
	
	}

}
