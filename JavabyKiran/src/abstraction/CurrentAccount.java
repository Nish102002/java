package abstraction;

import java.util.Scanner;

public class CurrentAccount extends BankAccount {
    Scanner sc=new Scanner(System.in);
    
    private double deposite_amount ,total_balance=50000, withdraw_amount;
    
    @Override
    void deposit() {
   	 System.out.println("current balance : "+total_balance);
   	 
   	 System.out.println("enter dposit amount : ");
   	 deposite_amount=sc.nextDouble();
   	 total_balance+=deposite_amount;
   	 System.out.println("total balance : "+total_balance);
    }
    
    @Override
    void withdraw() {
   	 System.out.println("enter withdraw amount : ");
   	 withdraw_amount=sc.nextDouble();
   	 total_balance-=withdraw_amount;
   	 System.out.println("total balance : "+total_balance);
    }
}
