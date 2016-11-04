package interest;

import java.util.ArrayList;

import banking.Account;

public class Person {
	
	//fields
	private ArrayList<Wallet> wallet;
	
	//constructor
	public Person() {
		wallet = new ArrayList<Wallet>();
	}
	
	//behaviors
	public void addWallet(Wallet w) {
		wallet.add(w);
	}
	
	//calculate Interest per person
	public double calcInterestPerPerson() {
		double sum = 0;
		for (int i=0; i<wallet.size(); i++) {
			sum = sum + wallet.get(i).calcInterestPerWallet();
		}
		return sum;
	}
	
}
