package day12MiniProject;
import java.util.*;
class BankAcc{
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public void set(int accountNumber) {
		if(accountNumber>0)
			this.accountNumber=accountNumber;
	}

	public int get() {
		return accountNumber;
	}

	public void set(String accountHolderName) {
		if(!accountHolderName.isEmpty())
			this.accountHolderName=accountHolderName;
	}

	public String get1() {
		return accountHolderName;
	}

	public void set(double balance) {
		if(balance>=0)
			this.balance=balance;
	}

	public double get2() {
		return balance;
	}

	void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Amount deposited successfully: "+amount);
		}
		else {
			System.out.println("Invalid Deposit Amount");
		}
	}

	void withdra(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdrawal Amount");
		}
		else if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance=balance-amount;
			System.out.println("Amount withdrawn successfully: "+amount);
		}
	}

	void displayand() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Current Balance: "+balance);
		System.out.println("----------------------------");
	}
}
public class BankAccountProject  {
	public static void main(String[] args) {
		BankAcc b=new BankAcc();
		b.set(1001);
		b.set("Arun");
		b.set(5000.0);
		b.displayand();
		b.deposit(2000.0);
		b.withdra(1500.0);
		b.displayand();
	}
}
