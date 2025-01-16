package homework;

import java.util.Scanner;

public class Bingo {
	public static boolean checkbingo(int num){
        while (num>0) {
        	if(num%10==7) {
        		return true;
        	}
        	//num/=10;
        	num = num/10;
        }
        return false;
	}
	
    public void  calbingo () {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter number: ");
		int num=sc.nextInt();
		
		if (num%7==0 && !checkbingo( num) ) {
			System.out.println("the number is bingo");
		}else {
			System.out.println("the number not bingo");
		}
    }
    	
    
}
