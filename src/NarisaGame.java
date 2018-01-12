import java.util.Random;

/**
 * Game of quessing number
 * @author Narisa Singngam
 */
public class NarisaGame extends NumberGame {

	private int upperBound;
	private int secret;
	private int count;
/**
 * Initialize a new game.
 * @param upperBound is the max value for the secret number (>1).
 */
	public NarisaGame(int upperBound) {
		this.upperBound = upperBound;
		long seed = System.nanoTime();
		Random random = new Random(seed);
		this.secret = random.nextInt(upperBound)+1;
		super.setMessage("I'm thinking of a number between 1 -" + upperBound);

	}

	@Override
	/**
	 * @param number is the number that you guess.
	 * @return the correct number
	 */
	public boolean guess(int number) {
		count++;
		if (number == secret) {
			setMessage("correct number");
			return true;
		}
		if (number > secret) {
			setMessage("this number is too large");
		} else if (number < secret) {
			setMessage("this number is too small");
		}
		return false;
	}

	/** 
	 * Get the upperBound
	 */
	public int getUpperBound() {
		return upperBound;
	}

	
	public String toString() {
		return "Guess a secret number between 1 and 100";
	}
	
	@Override
	/** To count the time that you guess */
	public int getCount(){
		return count;
	}

}
