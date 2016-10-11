package spil;

public class DiceCup {

	private Dice d1; //terning 1
	private Dice d2; //terning 2

	private int roundScore; //nuværende sum af antal øjne på de to terninger

	/**
	 * Default constructor.
	 * Creates dicecup with two dices.
	 */
	public DiceCup() {
		d1 = new Dice();
		d2 = new Dice();
	}

	/**
	 * Gets turn points
	 * @return int
	 */
	public int getRoundScore() {
		return roundScore;
	}

	/**
	 * Sets round score11
	 * @param roundScore
	 */
	public void setRoundScore(int roundScore) {
		this.roundScore = roundScore;
	}

	/**
	 * Gets dice1 object
	 * @return Dice
	 */
	public int getD1() {
		return d1.getFaceValue();
	}

	/**
	 * Gets dice2 object
	 * @return Dice
	 */
	public int getD2() {
		return d2.getFaceValue();
	}

	/**
	 * Gets last result of dice1
	 * @return int1
	 */
	public int getLastD1() {
		return d1.getLastValue();
	}

	/**
	 * Gets last result of dice2
	 * @return int1
	 */
	public int getLastD2() {
		return d2.getLastValue();
	}

	/**
	 * Throws both dices in cup
	 * @return int
	 */
	public int throwDice() {
		d1.roll();
		d2.roll();
		setRoundScore(d1.getFaceValue() + d2.getFaceValue());
		return d1.getFaceValue() + d2.getFaceValue();
	}
}
