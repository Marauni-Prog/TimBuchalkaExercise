package bankAccount_classchallenge;

public class BankAccount {

	private String customerName;
	private String email;
	private double balance;
	private int accountNumber;
	
	public BankAccount(String customerName,String email) {
		this.customerName=customerName;
		this.email=email;
		accountNumber=(int)(Math.random()*10000);
		balance=0;
	}
	public BankAccount() {
		this("John DOE","myemail");
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.printf("%s %.2f %s\n", "A DEPOSIT OF ",amount," SUCCESSFUL");
		}
	}
	
	public void withdraw(double amount) {
		if((balance-amount)<0) {
			System.out.println("INSUFFICIENT BALANCE");
			return;
		}
		balance-=amount;
		System.out.printf("%s %.2f %s\n","YOU HAVE WITHDRAWED ",amount," SUCCESSFULLY");
	}
	
}
