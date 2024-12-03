package bankAccount_classchallenge;

public class Main {
	public static void main(String[]args) {
//		BankAccount myAccount = new BankAccount("FRED","FRED@EMAIL");
		BankAccount myAccount= new BankAccount();
		myAccount.deposit(200);
		myAccount.deposit(500);
		myAccount.withdraw(1000);
		System.out.println(myAccount.getBalance());
		myAccount.withdraw(200);
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getCustomerName());
		System.out.println(myAccount.getEmail());
		System.out.println(myAccount.getAccountNumber());
	}
}
