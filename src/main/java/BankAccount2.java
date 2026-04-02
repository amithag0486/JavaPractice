import java.util.*;

public class BankAccount2 {
	
	Map< String, Double>  accountInfo = new HashMap<>();
	
	double balance;
	String accountHolder;
	
	public BankAccount2(String accountHolder, double intialBalance) {
		if(accountHolder == null || accountHolder.isEmpty()) {
			System.out.println("Accoount holder name cannot be empty");
			return;
		}
		if(intialBalance < 0) {
			System.out.println("Accoount balance cannot be less than zero");
			return;
		}
		this.accountHolder = accountHolder;
		this.balance = intialBalance;
		accountInfo.put(accountHolder, balance);
	}
	
	
	public void deposit(String name, double amount) {
		
		if(!name.equals(accountHolder)) {
			System.out.println("Error: Account name does not match. Deposit rejected.");
			return;
		}
		
		if (amount <= 0) {
			System.out.println("Cannot Deposit zeo amount");
			return;
		}else {
		balance = balance + amount;
		accountInfo.put(accountHolder, balance);
		}
	}
	
	public void withdraw(String name, double withdrawamount) {
		
		if(!name.equals(accountHolder)) {
			System.out.println("Error: Account name does not match. Withdrwal rejected.");
			return;
		}
		if (withdrawamount > balance) {
			System.out.println("Cannot withdrwaw, balance less than zero");
			return;
		}
		balance = balance - withdrawamount; 
		accountInfo.put(accountHolder, balance);
	}
	
	public double checkBalance() {
		return balance;
	}
	
//	public class SavingsAccount extends BankAccount2 {
//		public double interestRate;
		
//		public SavingsAccount(double interestRate, double initialbalance, String accountHolder ) {
//			super(initialbalance,accountHolder);
//			this.interestRate = interestRate;
//		}
		
		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount2 myAccount = new BankAccount2("Amitha",0);
		System.out.println(myAccount.checkBalance());
		myAccount.deposit("AC",90000);
		System.out.println(myAccount.checkBalance());
		myAccount.withdraw("Amitha",5000);
		System.out.println(myAccount.checkBalance());

	}

}
