package cdio1;

public class Dice 

{
	private final int MAX = 6; 	// maximum øjne værdi
	private int faceValue; // nuværende øjne værdi

	// Konstruktør
	public Dice()	
	{
		faceValue = 0;
	}

	// Kast terning og returner øjne værdi
	public int roll()	
	{
		faceValue = (int)(Math.random() * MAX) + 1;
	return faceValue;
	}
	
	public int getFaceValue()
	{
		int result = faceValue;
		return faceValue;
	}


		
		
}
