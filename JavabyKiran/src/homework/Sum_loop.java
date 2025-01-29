package homework;
import java.util.Scanner;
public class Sum_loop {
// write a java program accept number from user and perform sum of digit of numbers until number comes single unit
	
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
