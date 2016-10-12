package banking;

import java.util.ArrayList;

public class Bank {
	
	//A bank has a:
	//Routing Number
	//Name
	//Accounts
	//Amount of money
	//Location
	
	private int routingNum;
	private String name;
	private String location;
	private ArrayList<Account> accounts;
	
	//Behaviors
	//rob
	//deposit
	//withdraw
	//create account
	//close account
	
	//constructor
	public Bank(String name, String location, int routingNum) {
		this.name = name;
		this.location = location;
		this.routingNum = routingNum;
		this.accounts = new ArrayList<Account>();
	}
	
	//create account
	public void createAccount(double balance, String owner, double minBalance, boolean isChecking) {
		int accountNum = accounts.size() + 1;
		Account a;
		//Account newAccount = new Account(balance, accountNum, owner, minBalance);
		if (isChecking) {
			a = new CheckingAccount(balance, accountNum, owner, minBalance, true);
		}
		else {
			ContinuousStrategy cs = new ContinuousStrategy(.1);
			a = new SavingsAccount(balance, accountNum, owner, minBalance, cs);
		}
		accounts.add(a);
	}
	
	//deposit
	public void makeDeposit(float amount, int accountNum) {
		Account a = accounts.get(accountNum-1);
		a.deposit(amount);
		//could also accomplish the above in a single line of code:
		//accounts.get(accountNum-1).deposit(amount);
	}

	//withdraw
		public void makeWithdrawal(float amount, int accountNum) {
			Account a = accounts.get(accountNum-1);
			a.withdraw(amount);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
