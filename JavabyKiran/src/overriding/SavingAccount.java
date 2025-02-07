package overriding;

public class SavingAccount extends BankAccount{
	@override
    public void withdraw() {
		System.out.println("enter balance: ");
		int balance=sc.nextInt();

    	if(balance<1000) {
    		System.out.println("your balance is low");
    	}else {
    	System.out.println("enter withdraw amount: ");
    	 float withdrawamount=sc.nextFloat();
    	 balance-=withdrawamount;
    	 System.out.println("remaining balance");
    }
	}
}
