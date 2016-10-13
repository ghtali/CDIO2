package spil;

public class BankAccount {

	private int balance;
	//initiate Bank Account 
	public BankAccount(int balance){
		
		if (balance < 0)
			this.balance = 0;
		else 
			this.balance = balance;
	}
	//se if player balance reached 3000
	public boolean isWin(){
		
		if (this.balance == 3000)
			return true;
		else
			return false;	
	}
	// Set player's balance to 0 if it is negative (Balance instead of deposit)
	public void changeBalance(int amount){
		
		if ((this.balance + amount)<0)
			this.balance = 0;
		else
			this.balance = this.balance + amount;		
	}
	
	public void Deposit(int amount){
		
	}
	public void Withdraw(int amount){
		
	}
	public int getBalance() 
	{
		return this.balance;
	}
	
	
	
	
	


}
