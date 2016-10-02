package cdio1;

public class Ui {
	
	public static void main(String[] args) 

	{
	
		java.util.Scanner input;
		Dice dice = new Dice();
		Player player1 = new Player();
		Player player2 = new Player();
		input = new java.util.Scanner(System.in);
		
	while(player1.getScore()< 40 && player2.getScore()<40)
	{
		int hit = 0;
		int sum = 0;
		System.out.print("\n\nPlayer 1's turn:");
		input.nextLine();
		for (int i=0; i<2; i++)
			{
				dice.roll();
			System.out.print(dice.getFaceValue() + "   ");
					player1.addScore(dice.getFaceValue());
					if(i==0){
					hit = dice.getFaceValue();
					}
					else{
					sum = dice.getFaceValue() + hit;
					System.out.print("\nSum of throws " + sum);
					if(Dice.Equals(hit) == true)
					{
						System.out.println("\nYou get an extra turn!");
						i = i - 2 ;
					}
					
					}
					
				}
		
		Player.printScore(player1,player2);
		
		// Change of turn
		
		System.out.print("\n\nPlayer 2's turn:");
		input.nextLine();
		for (int i=0; i<2; i++)
		{
			dice.roll();
		System.out.print(dice.getFaceValue() + "   ");
				player2.addScore(dice.getFaceValue()); // ADd hit to Player 2 score
				if(i==0){
				hit = dice.getFaceValue();
				}
				else
				{
				sum = dice.getFaceValue() + hit;
				System.out.print("\nSum of throws " + sum);
				if(Dice.Equals(hit) == true)
				{
					System.out.println("\nYou get an extra turn!");
					i = i - 2 ;
				}
				}

			}
		
		Player.printScore(player1,player2);
		
	}
		

	input.close();
	}
	

	
}
