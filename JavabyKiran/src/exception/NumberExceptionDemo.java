package exception;

import java.util.Scanner;

public class NumberExceptionDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int num;
			System.out.println("Enter number : ");
			num = sc.nextInt();	
			
			if(NumberExceptionDemo.countnum(num) !=4) {
				throw new NumberException("Enter number only in 4 digit");
			}else {
				System.out.println(num);
			}
		}catch(NumberException n) {
			n.showerror();
		}

	}
	
	public static int countnum(int y) {
		int count=0;
		while(y>0) {
			y=y/10;
			count++;
		}
		return count;
	}

}
