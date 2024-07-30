package _7.SnakeLadder;
import java.util.Random;

public class Dice {
	int diceCount;
	Dice(int diceCount){
		this.diceCount = diceCount;
	}
	public int rollDice() {
		int diceSumm = 0;
		for(int d = 0; d < diceCount; d++) {
			// Generate a random number b/w 1 to 6.
			Random random = new Random();
			int randomInt = random.nextInt(6) + 1;
			diceSumm = diceSumm + randomInt;
		}
		return diceSumm;
	}
}
