package cdio1;

public class Player 

{

	private int score;
	
//Konstruktør
public Player()
{
	score = 0;
}
// Henter scoren
public int getScore()
{
	int result = this.score;
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
	score = 0;
}

}
