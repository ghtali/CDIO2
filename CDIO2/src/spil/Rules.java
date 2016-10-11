package spil;

public class Rules {

	/**
	 * Evaluates if equal dices were thrown
	 * @param cup DiceCup
	 * @return boolean
	 */
	public static boolean evalEqual(DiceCup cup) {
		return cup.getD1() == cup.getD2();
	}

	/**
	 * Evaluates if two ones were thrown.
	 * @param cup DiceCup
	 * @return boolean
	 */
	public static boolean evalTwoOnes(DiceCup cup) {
		return cup.getD1() == 1 && cup.getD2() == 1;
	}

	/**
	 * Evaluates if two sixes were thrown two rounds in a row
	 * @param cup DiceCup
	 * @return boolean
	 */
	public static boolean evalTwoSixesInRow(DiceCup cup) {
		return cup.getD1() == 6 && cup.getD2() == 6 && cup.getLastD1() == 6 && cup.getLastD2() == 6;
	}

	/**
	 * Evaluates if player has 40 or more points
	 * @param player Player
	 * @return boolean
	 */
	public static boolean evalFourty(Player player) {
		return player.getPoints() >= 40;
	}
}
