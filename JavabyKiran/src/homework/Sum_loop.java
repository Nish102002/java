package homework;
import java.util.Scanner;
public class Sum_loop {
//Write a function named "sumFromTo" that takes two integer arguments, call them "first" and
//	"last", and returns as its value the sum of all the integers between first and last inclusive. 
	
	public static void main(String[] args) {
		Sum_loop L1=new Sum_loop();
		L1.loop();
	}
	
	public void loop() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		
		while(num>=10) {
			int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		num=sum;
	}
		System.out.println(num);
	}
		}