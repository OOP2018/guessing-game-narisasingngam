/**
 * 
 * Automatically find the secret to any NumberGame.
 *@author Narisa Singngam
 */
public class GameSolver {
	
	/**
	 * To solve the game 
	 * @param game is the NumberGame to solve
	 * @return The correct answer
	 */
	
	public int play(NumberGame game){
		int num = 0;
		while(true){
			num++;
			if(game.guess(num)) break;
		}
		return num;
		
	}

}
