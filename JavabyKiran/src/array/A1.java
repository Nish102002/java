package array;

public class A1 {
	public static void main(String[] args) {
		 char[] A1= {'a','b','c','d','e'};
		 
		 int[] count =new int[123];
		 
		 for(char ch : A1) {
			 count[ch]++;
				 
				 
		 }
		 System.out.println("character count: ");
		 for(char ch : A1) {
			 if(count[ch]>0) {
				 System.out.println(ch+" "+count[ch]);
				 count [ch]=0;
			 }
		 }
	 }

}
