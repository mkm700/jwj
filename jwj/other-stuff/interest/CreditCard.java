package interest;

public abstract class CreditCard {
	//fields
	protected double interestRate;
	protected double balance;
	
	public CreditCard() {
		this.balance = 0;
	}
	
	//behaviors
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double calcInterestPerCard() {
		return this.balance * this.interestRate;
	}
	
}
