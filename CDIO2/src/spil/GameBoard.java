package spil;

import java.util.Scanner;

public class GameBoard {

	private Player p1 = new Player();
	private Player p2 = new Player();
	private Player winner = null;
	private DiceCup c1 = new DiceCup();
	private DiceCup c2 = new DiceCup();
	private Scanner scan = new Scanner(System.in);

	public GameBoard() {}

	/**
	 * Main Loop running the game
	 * return void
	 */
	public void gameLoop() {

		System.out.println("Velkommen til terning spillet! Spillet er et spil mellem to personer, der går ud på først\n"
				+ "at opnå 40 point, ved at slå med to terninger, og derefter slå 2 ens for at vinde spillet.\n"
				+ "\n"
				+ "Der er dog nogle regler, der lyder som følger:\n"
				+ "\n"
				+ "\t1. Hvis man slår to ens får man et ekstra slag.\n"
				+ "\t2. Hvis man slår to 1'ere nulstilles ens point, men man får dog stadig sit ekstra slag.\n"
				+ "\t3. Hvis man på noget tidspunkt slår to 6'ere to gange i træk, har man øjeblikkeligt vundet.\n"
				+ "\n"
				+ "Først skal vi lige have navnene på de to spillere, skriv navnet på første spiller og afslut med \"enter\":");

		p1.setName(scan.nextLine());

		System.out.println("Og nu navnet på anden spiller, afslut med \"enter\":");

		p2.setName(scan.nextLine());

		System.out.println("Vi er nu klar til at spille.\n");
		
		while(winner == null)
		{
			startTurn(p1, c1);
			
			startTurn(p2, c2);
		}
		scan.close();
		
		System.out.println();
	}

    /**
     * Starts turn for a player, and corresponding dicecup
     * @param p Player
     * @param c DiceCup
     */
	public void startTurn(Player p, DiceCup c) {

		boolean extraTurn = true;

		while (extraTurn && winner == null)
		{
			System.out.print("Det er " + p.getName() + " til at slå, du har pt. " + p.getPoints() + " points,"
					+ " tryk \"enter\" for at slå.");
			
			scan.nextLine();

			extraTurn = false;
			c.throwDice();

			System.out.println("Du slog en " + c.getD1() + "'er og en " + c.getD2() + "'er.");

			if (Rules.evalTwoOnes(c))
			{
				extraTurn = true;
				p.setPoints(0);
				System.out.println(p);
				continue;
				
			} else if (Rules.evalTwoSixesInRow(c))
			{
				winner = p;
				System.out.println(p.getName() + " har vundet spillet ved at slå to 6'ere to gange i træk!");
				break;
				
			} else if (Rules.evalFourty(p) && Rules.evalEqual(c))
			{
				winner = p;
				System.out.println(p.getName() + " har vundet spillet ved at få 40 point og slå to ens.");
				break;
				
			} else if (Rules.evalEqual(c))
			{
				extraTurn = true;	
			}
			
			p.addPoints(c.getD1()+c.getD2());
			
			if (p.getPoints() >= 40)
			{
				p.setPoints(40);
			}
			
			System.out.println(p);
		}


	}
}

