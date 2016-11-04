package interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterestTests {

	//1 person has 1 wallet and 3 cards (1 Visa, 1 MC 1 Discover) – 
	//Each Card has a balance of $100 – calculate the total interest (simple interest) 
	//for this person and per card. 
	@Test
	public void testCase1() {
		//Create a person
		Person p1 = new Person();
			
		//Create a wallet
		Wallet w1 = new Wallet();
				
		//Create 3 new cards
		CreditCard visa = new Visa();
		CreditCard mc = new MasterCard();
		CreditCard discover = new Discover();
		
		//set card balance
		visa.setBalance(100);
		mc.setBalance(100);
		discover.setBalance(100);
		
		//Assign wallet to person
		p1.addWallet(w1);
		
		//Add cards to the wallet
		w1.addCreditCard(visa);
		w1.addCreditCard(mc);
		w1.addCreditCard(discover);
		
		//calculate interest per card
		assertEquals(10.00,visa.calcInterestPerCard(),0);
		assertEquals(5.00,mc.calcInterestPerCard(),0);
		assertEquals(1.00,discover.calcInterestPerCard(),0);
		
		//calculate total interest for Person
		assertEquals(16.0,p1.calcInterestPerPerson(),0);

	}
	
	//1 person has 2 wallets  Wallet 1 has a Visa and Discover , wallet 2 a MC -  
	//each card has $100 balance - calculate the total interest(simple interest) 
	//for this person and interest per wallet
	@Test
	public void testCase2() {
		//Create a person
		Person p1 = new Person();
			
		//Create 2 wallets
		Wallet w1 = new Wallet();
		Wallet w2 = new Wallet();
				
		//Create new cards
		CreditCard visa = new Visa();
		CreditCard discover = new Discover();
		CreditCard mc = new MasterCard();
		
		//set card balances
		visa.setBalance(100);
		mc.setBalance(100);
		discover.setBalance(100);
		
		//Assign wallets to person
		p1.addWallet(w1);
		p1.addWallet(w2);
		
		//Add cards to the wallet
		w1.addCreditCard(visa);
		w1.addCreditCard(discover);
		w2.addCreditCard(mc);
		
		//calculate interest per wallet
		assertEquals(11.00,w1.calcInterestPerWallet(),0);
		assertEquals(5.00,w2.calcInterestPerWallet(),0);
		
		//calculate total interest for Person
		assertEquals(16.0,p1.calcInterestPerPerson(),0);

	}
	
	
	//2 people have 1 wallet each,  person 1 has 1 wallet , with 2 cards MC and visa 
	//person 2 has 1 wallet – 1 visa and 1 MC -  
	//each card has $100 balance - calculate the total interest(simple interest) for each person 
	//and interest per wallet
	@Test
	public void testCase3() {
		//Create 2 people
		Person p1 = new Person();
		Person p2 = new Person();
			
		//Create a wallet
		Wallet w1 = new Wallet();
		Wallet w2 = new Wallet();
				
		//Create 4 new cards
		CreditCard visa1 = new Visa();
		CreditCard mc1 = new MasterCard();
		CreditCard visa2 = new Visa();
		CreditCard mc2 = new MasterCard();
		
		//set card balance
		visa1.setBalance(100);
		mc1.setBalance(100);
		visa2.setBalance(100);
		mc2.setBalance(100);
		
		//Assign wallet to person
		p1.addWallet(w1);
		p2.addWallet(w2);
		
		//Add cards to the wallet
		w1.addCreditCard(visa1);
		w1.addCreditCard(mc1);
		w2.addCreditCard(visa2);
		w2.addCreditCard(mc2);
		
		//calculate interest per wallet
		assertEquals(15.00,w1.calcInterestPerWallet(),0);
		assertEquals(15.00,w2.calcInterestPerWallet(),0);
		
		//calculate total interest for Person
		assertEquals(15.0,p1.calcInterestPerPerson(),0);
		assertEquals(15.0,p2.calcInterestPerPerson(),0);

	}
	
	
}
