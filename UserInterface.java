package CDIO1;

public class UserInterface {
	
	public static void main (String [] agrs) {
	
		Dice ui = new Dice(0);
		java.util.Scanner input = new java.util.Scanner(System.in);
	
	System.out.println("Who starts player 1 or 2? (1/2)");
	int player = input.nextInt();
	int p1Score = 0; int p2Score = 0; 
	
	do {
	if (player == 1 || player == 2) {
		System.out.println("The dice shows: ");
		for (int i=0; i<2; i++){
		ui.setFaceValue(ui.roll()); ui.getFaceValue(0); ui.toString();
		if (player == 1) {
			ui.player1(); if (i == 1) { ui.score1(); }}
		else if (player == 2) {
			ui.player2(); if (i == 1) { ui.getScore2(); }}
		if (i == 0)
			System.out.print(" & ");}
		} 
	String Score1 = "" + ui.getScore1(p1Score);  String Score2 = "" + ui.getScore2(p2Score);
	p1Score = Integer.parseInt(Score1); p2Score = Integer.parseInt(Score2);
	if (p1Score >= 40 || p2Score >= 40)
		break;
	else
		player = input.nextInt(); //Skal være der!!
	} while (p1Score <= 40 && p2Score <= 40);
	
	if (p1Score >= 40)
		System.out.println("Congratulation player 1, you won!");
	else if (p2Score >= 40)
		System.out.println("Congratulation player 2, you won!");
	input.close();
	
	}
}
