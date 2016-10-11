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

		System.out.println("Velkommen til terning spillet! Spillet er et spil mellem to personer, der g�r ud p� f�rst\n"
				+ "at opn� 40 point, ved at sl� med to terninger, og derefter sl� 2 ens for at vinde spillet.\n"
				+ "\n"
				+ "Der er dog nogle regler, der lyder som f�lger:\n"
				+ "\n"
				+ "\t1. Hvis man sl�r to ens f�r man et ekstra slag.\n"
				+ "\t2. Hvis man sl�r to 1'ere nulstilles ens point, men man f�r dog stadig sit ekstra slag.\n"
				+ "\t3. Hvis man p� noget tidspunkt sl�r to 6'ere to gange i tr�k, har man �jeblikkeligt vundet.\n"
				+ "\n"
				+ "F�rst skal vi lige have navnene p� de to spillere, skriv navnet p� f�rste spiller og afslut med \"enter\":");

		p1.setName(scan.nextLine());

		System.out.println("Og nu navnet p� anden spiller, afslut med \"enter\":");

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
			System.out.print("Det er " + p.getName() + " til at sl�, du har pt. " + p.getPoints() + " points,"
					+ " tryk \"enter\" for at sl�.");
			
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
				System.out.println(p.getName() + " har vundet spillet ved at sl� to 6'ere to gange i tr�k!");
				break;
				
			} else if (Rules.evalFourty(p) && Rules.evalEqual(c))
			{
				winner = p;
				System.out.println(p.getName() + " har vundet spillet ved at f� 40 point og sl� to ens.");
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

