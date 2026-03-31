
public class BankAccount {
	
	double balance;
	String accountHolder;
	
	public BankAccount (double initialbalance, String accountHolder) {
		this.balance = initialbalance;
		this.accountHolder = accountHolder;
		
	}
	
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Cannot Deposit zeo amount");
		}
		balance = balance + amount;
	}
	
	public void withdraw(double withdrawamount) {
		if (balance <= 0) {
			System.out.println("Cannot withdrwaw, balance less than zero");
		}
		balance = balance - withdrawamount; 
	}
	
	public double checkBalance() {
		return balance;
	}
	
	public class SavingsAccount extends BankAccount {
		public double interestRate;
		
		public SavingsAccount(double interestRate, double initialbalance, String accountHolder ) {
			super(initialbalance,accountHolder);
			this.interestRate = interestRate;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount myAccount = new BankAccount(0,"Amitha");
		System.out.println(myAccount.checkBalance());
		myAccount.deposit(90000);
		System.out.println(myAccount.checkBalance());
		myAccount.withdraw(5000);
		System.out.println(myAccount.checkBalance());

	}

}
