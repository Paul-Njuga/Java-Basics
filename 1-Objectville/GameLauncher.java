import java.util.Random;

public class GameLauncher {
	public static void main(String[] args) {
		GuessGame game = new GuessGame();
		game.startGame();
	};
}

class Player {
	int number = 0;

	public void guess() {
		number = (int) (Math.random() * 10);
	}
}

class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");

		while (true) {
			System.out.println("The number to guess is " + targetNumber);

			p1.guess();
			p2.guess();
			p3.guess();

			String[] rndWords = {" say", " think", " bet", "'m pretty sure"};
			int wrdsLength = rndWords.length;
			Random rndGen = new Random();
			int rndInd = rndGen.nextInt(wrdsLength);

			System.out.println("  Player One: I" + rndWords[rndInd] + " it's " + p1.number);
			System.out.println("  Player Two: I" + rndWords[rndInd] + " it's " + p2.number);
			System.out.println("  Player Three: I" + rndWords[rndInd] + " it's " + p3.number);

			if (p1.number == targetNumber) {
				p1isRight = true;
			}
			if (p2.number == targetNumber) {
				p2isRight = true;
			}
			if (p3.number == targetNumber) {
				p3isRight = true;
			}
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("\nWe have a winner!");
				if (p1isRight) {
					System.out.println("Player one got it right.");
				} else if (p2isRight) {
					System.out.println("Player two got it right.");
				} else if (p3isRight) {
					System.out.println("Player three got it right.");
				}
				System.out.println("\nSadly, the game is over.\nUntil next time.");
				break; // game over, so break out of the loop
			} else {
				// we must keep going because nobody got it right!
				System.out.println("Players will have to try again.\n");
			} // end if/else
		} // end loop
	} // end method
} // end class
