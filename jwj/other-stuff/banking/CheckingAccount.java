package banking;

public class CheckingAccount extends Account {
	//has-a
	private boolean overDraftProtection;
	
	//constructor
	public CheckingAccount(double balance, int number, String owner, double minBalance, boolean overDraftProtection) {
		super(balance, number, owner, 5);
		this.overDraftProtection = overDraftProtection;
	}
	
	//behaviors
	//charge a fee if no overdraft protection
	public void chargeOverdraftFee(int fee) {

	}
	
}
