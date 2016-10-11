package spil;

public class Player {
	
	private int points = 0;
	private String name;
	
	public Player() {}

	/**
	 * Gets point on player object
	 * @return int
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * Sets points on player object
	 * @param points int
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	/**
	 * Appends point on player object
	 * @param points int
	 */
	public void addPoints(int points) {
		this.points = this.points + points;
	}

	/**
	 * Returns player name from player object
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets player name on player object
	 * @param name String
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Prints player name and points. Overrides default toString method
	 * @return String
	 */
	public String toString() {
		return name + " har nu " + points + " points.\n";
	}
}
