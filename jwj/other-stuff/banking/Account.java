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
	
	private float balance;
	private int number;
	private String owner;
	private final float MIN_BALANCE = 50;  //constant
	
	//constructor
	public Account(float balance, int number, String owner) {
		this.balance = balance;
		this.number = number;
		this.owner = owner;
	}	
	
	//getters
	public float getBalance() {
		return this.balance;
	}
	
	//behaviors
	public boolean withdraw(float amount) {
		if (this.balance - MIN_BALANCE >= amount ) {
			this.balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void deposit(float amount) {
		//TODO: check amount, if it is negative, throw an exception
		if (amount > 0) {
			this.balance += amount;
	
		}
	}
	
	public boolean transfer(Account from, float amount) {
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
		Account a = new Account(500.00f, 123, "Mary Kay Murdaugh");
		Account b = new Account(200.00f, 678, "Harry Potter");
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
