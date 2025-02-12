package abstraction;

public class MainBank {
	public static void main(String[] args) {
		
		BankAccount S = new SavingsAccount();
		BankAccount C =new CurrentAccount();
		
		S.deposit();
		S.withdraw();
		C.deposit();
		C.withdraw();
		
	}

}
