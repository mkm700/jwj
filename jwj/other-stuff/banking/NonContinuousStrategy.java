package banking;

public class NonContinuousStrategy implements Compoundable {
	//design consideration: interest rate
	//should it be taken in as a parameter of the interface?
	//or does it make more sense for it to remain with the savings account?
	
	//balance: what about balance?  How to handle it?
	
	//has-a
	private int periods;
	private double interestRate;
	
	//constructor
	public NonContinuousStrategy(int periods, double interestRate) {
		this.periods = periods;
		this.interestRate = interestRate;
	}

	@Override
	public double compoundInterest(double balance) {
		double rOverN = 1 + this.interestRate / periods;
		rOverN = Math.pow(rOverN, periods);
		balance = balance * rOverN;
		return balance;
	}

}
