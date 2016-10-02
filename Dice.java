package CDIO1;

public class Dice {
	
	private final int MAX = 6; 	// maximum øjne værdi
	private int faceValue; // nuværende øjne værdi
	private int score1;
	private int score2;

	// konstruktør
	public Dice(int value)	{
		faceValue = value;
	}

	// kast terning og returner øjne værdi
	public int roll()	{
		faceValue = (int)(Math.random() * MAX) + 1;
	return faceValue;
	}

	// sæt øjne værdi
	public int setFaceValue (int value)	{
		faceValue = value;
		return faceValue;
	}

	// hent øjne værdi
	public int getFaceValue(int value)	{
		value = faceValue;
		return value;
	}

	// returnerer en streng repræsentation af objektets data
	public String toString()	{
		String result = "" + faceValue;
		System.out.print(result);
	return result;
	}
	
	//Tæller for spiller 1.
	public int player1 () {
		score1 = score1 + faceValue;
		return score1;
	}
	
	//udskriver spiller 1 score
	public int score1 () {
		System.out.println("\nPlayer 1 score: " + score1);
		return score1;
	}
	
	public int getScore1(int result) {
		result = score1;
		return result;
	}
	
	//Tæller for spiller 2.
	public int player2 () {
		score2 = score2 + faceValue;
		return score2;
	}
	
	//udskriver spiller 2 score
	public int getScore2 () {
		System.out.println("\nPlayer 1 score: " + score2);
		return score2;
	}
	
	public int getScore2(int result) {
		result = score2;
		return result;
	}

}
