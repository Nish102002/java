package exception;

import java.util.Scanner;

public class Account_Holder {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	    
		double withdraw_amount;
		double current_amount=50000;
		
		try {
			System.out.println("current balance is: "+current_amount);
			System.out.println("enter withdraw amount: ");
			withdraw_amount=sc.nextDouble();
			
			if(withdraw_amount > current_amount ) {
				throw new Insufficient_Balance("Withdraw mount exceed than current  balance");
			}
			
			if((current_amount - withdraw_amount ) <= 1000) {
				throw new Insufficient_Balance("Maintain minimum balance");
			}else {
				throw new Insufficient_Balance("Withdrawal successful ");
			}
			
			
			
			
		}
		catch(Insufficient_Balance b) {
			b.showerror();
		}finally {
			System.out.println("Done");
		}
		
	}

}
