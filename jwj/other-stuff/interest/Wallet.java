package interest;

import java.util.ArrayList;

public class Wallet {
	//fields
	private ArrayList<CreditCard> creditCard;

	//constructor
	public Wallet() {
		this.creditCard = new ArrayList<CreditCard>();
	}
	
	//behaviors
	public void addCreditCard(CreditCard cc) {
		creditCard.add(cc);
	}
	
	//calc interest per wallet
	public double calcInterestPerWallet() {
		
		double sum = 0;
		
		for (int i=0; i < creditCard.size(); i++) {
			sum = sum + this.creditCard.get(i).calcInterestPerCard();
		}
		
		return sum;
	}
}
