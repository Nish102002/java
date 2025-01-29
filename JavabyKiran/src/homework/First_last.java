package homework;
import java .util.Scanner;
public class First_last {
//  Write a function named "sumFromTo" that takes two integer arguments, call them "first" and
// "last", and returns as its value the sum of all the integers between first and last inclusive.
	  
	public static void main(String[] args) {
		First_last F1=new First_last();
          int total=F1.sumfromto(4,7);
          System.out.println(total);
	}
	
	public  int sumfromto(int first ,int last) {
		int sum=0;
		
		for(int i=first; i<=last; i++) {
			sum+=i;
		}
		return sum;
	}
}

