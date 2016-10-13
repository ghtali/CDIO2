package spil;

public class Player{
	
	private int points = 0;
	private String playerName;
	private BankAccount bankAccount;
	private int id;
	private int nextId;
	
	/**
	 * Create a new Bank Account for a new player
	 * @set Player banck account to 1000 for the first time
	 */
	public Player() {
		
		bankAccount = new BankAccount(1000);
		
	}
	
	public BankAccount getBankAccount()
	{
		return bankAccount;
	}
	
	public String getplayerName() {
		return playerName;
	}
	
	public int getID() {
	return id;
}
	
	
	
	
//	public String toString() {
//		return name + " har nu " + points + " points.\n";
//	}
	

//	/**
//	 * Gets point on player object
//	 * @return int
//	 */
//	public int getPoints() {
//		return points;
//	}

//	/**
//	 * Sets points on player object
//	 * @param points int
//	 */
//	public void setPoints(int points) {
//		this.points = points;
//	}
//
//	/**
//	 * Appends point on player object
//	 * @param points int
//	 */
//	public void addPoints(int points) {
//		this.points = this.points + points;
//	}

	
	/**
	 * Returns player name from player object
	 * @return String
	 */




	/**
	 * Prints player name and points. Overrides default toString method
	 * @return String
	 */

}
