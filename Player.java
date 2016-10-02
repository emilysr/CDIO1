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

public static void printScore(Player player1,Player player2)
{
	if(player1.getScore()>40)
		System.out.println("\nPlayer 1's score: 40");
	else
		System.out.println("\nPlayer 1's score: " + player1.getScore());
	
	if(player2.getScore()>40)
		System.out.println("Player 2's score: 40");
	else
		System.out.println("Player 2's score: " + player2.getScore());
}




}
