package spil;

public class Dice {
	
	private final int MAX = 6 ; // Sides on the dice
	private int faceValue = 1; 	// Current value on the dice
	private int lastValue = 1;

	/**
	 * Default constructor
	 */
	public Dice() {}

	/**
	 * Copy Constructor. Copies dice attributes to new object
	 * @param t Dice
	 */
	public Dice(Dice t)
	{
		faceValue = t.faceValue;
	}

	/**
	 * Sets facevalue of dice. If value doesnt fit the dice, a roll will be applied for a random value.
	 * @param value int
	 */
	public void setFaceValue(int value)
	{
		if (value >= 1 && value <= MAX)
		{
			faceValue = value;
		} else this.roll();
	}

	/**
	 * Gets current dice value (getter)
	 * @return int
	 */
	public int getFaceValue()
	{
		return faceValue;
	}

	/**
	 * Sets last value on dice (setter)
	 * @param value int
	 */
	public void setLastValue(int value) {
		lastValue = value;
	}

	/**
	 * Returns laster value on dice (getter)
	 * @return int
	 */
	public int getLastValue() {
		return lastValue;
	}

	/**
	 * Sets random value to facevalue on dice and stores previous result beforehand.
	 * @return int
	 */
	public int roll()
	{
		setLastValue(getFaceValue());
		int roll = ( int )( Math.random() * MAX ) + 1;
		setFaceValue(roll);
		return roll;
	}

	/**
	 * Testing method used to verify acceptance of roll-randomness (Unused in solution)
	 */
	public void unfairRoll(){
		float d1=(float)Math.random();     // 0-1
		float d2=d1*5;                     // 0-5
		int d3=Math.round(d2);             // 0-5 integer
		setFaceValue(d3+1);
	}

	/**
	 * Override method to print dice result
	 * @return String
	 */
	public String toString()
	{
		String result = "øjne: " + faceValue;
		return result;
	}
}