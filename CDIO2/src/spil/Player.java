package spil;

public class Player{

	private int points = 0;
	private String playerName;
	private BankAccount bankAccount; // instead of Bank I used BankAccount
	private int id; // I suggest that we use the ID in the GAmeboard
	private int nextId; // I suggest that we use nextId in the Gameboard

	/**
	 * Create a new Bank Account for a new player
	 * @set Player accounts balance to 1000 for the first time
	 */
	public Player() {

		bankAccount = new BankAccount(1000);

	}
	
	// used set methode to set player names

	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}

	// used get to return player bank account	
	public BankAccount getBankAccount(){
		return bankAccount;
	}

	//USed get methode to return player name
	public String getPlayerName(){
		return playerName;
	}
	// get method for getting objects! ID
	public int getID(){
		return id;
	}
	// used get method to return next object id!!
	public int getNextID(){
		
		return nextId;
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
