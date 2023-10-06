class Customer{
	String name;
	long phNumber;
	
	Customer(String name, long phNumber) {
		this.name=name;
		this.phNumber=phNumber;
	}
	
	void personalDetails() {
		System.out.println("Name: "+name);
		System.out.println("Phone number: "+phNumber);
	}
	
}

class Account{
	long accNumber;
	double balance;
	
	Account(long accnum, double bal) {
		this.balance=bal;
		this.accNumber=accnum;
	}
	
	void display() {
		System.out.println("Balance: "+balance);
		System.out.println("Account number: "+accNumber);
	}
	
}


class RBI{
	Customer customer;
	Account account;
	
	RBI(Customer customer, Account account) {
		this.customer=customer;
		this.account=account;
	}
	
	public double getInterestRate() {
		return 4.0;
	}
	
	public double getWithdrawalLimit() {  
        return 100000; 
    }
}

public class Bank {

}
































