import java.util.Random;

/**
 * 
 * Automatically find the secret to any NumberGame.
 * 
 * @author Narisa Singngam
 */
public class GameSolver {

	/**
	 * To solve the game
	 * 
	 * @param game
	 *            is the NumberGame to solve
	 * @return The correct answer
	 */

	public int play(NumberGame game) {
		int max = game.getUpperBound();
		int min = 1;
		int guess = 0;
		
		

		while (!game.guess(guess)) {

			

			if (game.getMessage().contains("too large")) {
				max = guess - 1;

			} else if (game.getMessage().contains("too small")) {
				min = guess + 1;

			}
			guess = min + (max - min) / 2;

		System.out.println(guess);

		}
		return guess;

	}

}
