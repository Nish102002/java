package homework;
import java .util.Scanner;
public class First_last {
// write a java program accept number from user and perform sum of digit of numbers until number comes single unit
	  
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

