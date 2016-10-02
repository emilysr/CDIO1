package cdio1;

public class Ui {

	static Dice dice = new Dice();
	static Player player1 = new Player();
	static Player player2 = new Player();
	
	public static void main(String[] args) 
	
	{

		
	while(player1.getScore()< 40 && player2.getScore()<40)
	{
		int hit = 0;
		int sum = 0;
		System.out.println("\n\nPlayer 1's turn:");
		for (int i=0; i<2; i++)
			{
				dice.roll();
			System.out.print(dice.getFaceValue() + "   ");
					player1.addScore(dice.getFaceValue()); // Tilføj slag til Player 1 score
					if(i==0){
					hit = dice.getFaceValue();
					}
					else{
					sum = dice.getFaceValue() + hit;
					System.out.print("\nSum of throws " + sum);
					if(compareHits(hit) == true)
					{
						System.out.println("\nYou get an extra turn!");
						i = i - 2 ;
					}
					
					}
					
				}
		
		Ui.printScore();
		
		// Change of turn
		
		System.out.println("\n\nPlayer 2's turn:");
		for (int i=0; i<2; i++)
		{
			dice.roll();
		System.out.print(dice.getFaceValue() + "   ");
				player2.addScore(dice.getFaceValue()); // Tilføj slag til Player 2 score
				if(i==0){
				hit = dice.getFaceValue();
				}
				else
				{
				sum = dice.getFaceValue() + hit;
				System.out.print("\nSum of throws " + sum);
				if(compareHits(hit) == true)
				{
					System.out.println("\nYou get an extra turn!");
					i = i - 2 ;
				}
				}

			}
		
		Ui.printScore();
	}
		


	}
	
	public static boolean compareHits(int hit)
	{
		boolean result = false;
		if(dice.getFaceValue() == hit)
		{
			result = true;
		}
		return result;
	}	
	public static void printScore()
	{
		if(player1.getScore()>40)
		{
			System.out.println("\nPlayer 1's score: 40");
		}
		else
		{
		System.out.println("\nPlayer 1's score: " + player1.getScore());
		}
		
		if(player2.getScore()>40)
		{
			System.out.println("Player 2's score: 40");
		}
		else
		{
		System.out.println("Player 2's score: " + player2.getScore());
		}
	}
}
