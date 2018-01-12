import java.util.Random;

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
		int middle = game.getUpperBound()/2;
		int quarter = game.getUpperBound()/4;
		
		while(!game.guess(middle)){
			if(game.getMessage().contains("too large")){
				middle = middle-quarter;
				
			}
			else if(game.getMessage().contains("too small")){
				middle = middle+quarter;
			}
			if(quarter!=1){
				quarter=quarter/2;
			}
			
			System.out.println(middle);
		}
		return middle;
		
		
	}

}
