package banking;

public class Account {
	/*An account has-a:
	* balance
	* number
	* type (this will be covered later -- inheritance)
	* owner  (for more complex, consider creating a Person object so you can store more info, link names, address, SS, etc)
	*/
	
	/*behaviors
	* deposit
	* withdraw
	* transfer
	* overdraft
	*/
	
	protected double balance;
	private int number;
	private String owner;
	private double minBalance;
	
	//constructor
	public Account(double balance, int number, String owner, double minBalance) {
		this.balance = balance;
		this.number = number;
		this.owner = owner;
		this.minBalance = minBalance;
	}	
	
	//getters
	public double getBalance() {
		return this.balance;
	}

	
	//behaviors
	public boolean withdraw(double amount) {
		if (this.balance - minBalance >= amount ) {
			this.balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void deposit(double amount) {
		//TODO: check amount, if it is negative, throw an exception
		if (amount > 0) {
			this.balance += amount;
	
		}
	}
	
	public boolean transfer(Account from, double amount) {
		if(from.withdraw(amount)) {
			this.deposit(amount);
			return true;
		}
		return false;
	}
	
	public String toString() {
		return owner + "\nAcct no: " + number + "\nBalance: " + balance;
	}
	
	

	public static void main(String[] args) {
		Account a = new Account(500.00f, 123, "Mary Kay Murdaugh", 50);
		Account b = new Account(200.00f, 678, "Harry Potter", 50);
//		System.out.println(a);
//		System.out.println(a.getBalance());
//		a.withdraw(200);
//		System.out.println(a.getBalance());
//		a.withdraw(275);
//		System.out.println(a.getBalance());
//		a.deposit(500);
//		System.out.println(a.getBalance());
//		a.withdraw(275);
//		System.out.println(a.getBalance());
		System.out.println("MK: " + a.getBalance());
		System.out.println("HP: " + b.getBalance());
		b.transfer(a, 100);
		System.out.println("MK: " + a.getBalance());
		System.out.println("HP: " + b.getBalance());
		
	}

}
