package series;

public class Pallindrome {
     static int reverse(int num) {
    	 int reverse_num=0;
    	 while(num>0) {
    		 reverse_num=reverse_num*10+num%10;
    		 num=num/10;
    	 }
    	 return reverse_num;
     }
     public static void main(String[] args) {
		int num=123454321;
		int reverseN=reverse(num);
		System.out.println("reverse number: "+reverseN);
		if(num==reverseN) {
			System.out.println("Pallindrome");
	
		}else {
			System.out.println("not Palindrome");
		}
	}
}
