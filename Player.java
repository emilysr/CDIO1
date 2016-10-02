package cdio1;

public class Player 

{

	private int score;
	
//Konstruktør
public Player()
{
	this.score = 0;
}
// Henter scoren
public int getScore()
{
	int result = score;
	return result;
}
// Tilføjer en værdi til spillerens score
public void addScore(int score)
{
	this.score = this.score + score;
}
// Nulstil scoren
public void resetScore()
{
	this.score = 0;
}

// Win conditions
public void primeWin(int score)
{
	boolean winCon = false;
	if(score >= 40)

	{
		winCon = true;
	}
}




}
