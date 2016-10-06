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
	public void createAccount(float balance, String owner) {
		int accountNum = accounts.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
