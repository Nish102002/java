package String;

public class Space {
	public static void main(String[] args) {
		String s="    nish  ";
		int count=0,l=0;
		while(l<s.length()) {
			char ch=s.charAt(l);
			if(ch==' ')
				count++;
			l++;
		}
		System.out.println(count);
		
	
	
	}
	public void count(){
		String S="    nish  ";
		int c=0,k=0;
		while(k<S.length()) {
			char ch=S.charAt(k);
			if(ch=='a')
				c++;
			k++;
		}
		System.out.println(c);
		}
		}
	


