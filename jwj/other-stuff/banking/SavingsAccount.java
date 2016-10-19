package banking;

public class SavingsAccount extends Account {

		//has-a
		private final int MAX_WITHDRAWALS = 6;
		private int currentWithdrawals;
		private Compoundable interestStrategy;
		
		//constructor
		public SavingsAccount(double balance, int number, String owner, double minBalance, Compoundable strategy) {
			super(balance, number, owner, 500);
			this.currentWithdrawals = 0;
			this.interestStrategy = strategy;
		}

		//behaviors
		//compounding interest
		public void compoundInterest() { 
			this.balance = this.interestStrategy.compoundInterest(this.balance);
		}
		
		//counting withdrawals
		public boolean withdraw(double amount) {
			if (this.currentWithdrawals < this.MAX_WITHDRAWALS) {
				boolean result = super.withdraw(amount);
				if (result) {
					this.currentWithdrawals++;
				}
				return result;
			}
			return false;
		}
		
		public static void main(String[] args) {
			ContinuousStrategy cs = new ContinuousStrategy(.1);
			SavingsAccount mkSaves1 = new SavingsAccount(10000.0, 1, "Mary Kay",500,cs);
			NonContinuousStrategy ncs = new NonContinuousStrategy(12,.1);
			SavingsAccount mkSaves2 = new SavingsAccount(10000.0, 1, "Mary Kay",500,ncs);
			mkSaves1.compoundInterest();
			mkSaves2.compoundInterest();
			System.out.println("1: " + mkSaves1.balance);
			System.out.println("2: " + mkSaves2.balance);

		}

}
