import java.util.Random;
import java.util.Scanner;

public class BlackJack2
{
	public static void main(String[] args) {

		Random rand = new Random() ;
		int first = rand.nextInt(11)+1;
		int second = rand.nextInt(11)+1;
		int score1 = (first + second);
		first = rand.nextInt(11)+1;                              // Random number between 1-11
		second = rand.nextInt(10)+1;							// Random number between 1-10
		int score2 = (first + second);

		System.out.println("Player 1: Your hand is:" +score1);


		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);


		int p = 1;

		while ((p != 2) && (score1<22) || (p == 2 && score1<15))
		{	
			System.out.println("Player 1: 1 for Twist, 2 for Stick");

			p = scanner.nextInt();
			if (p == 1)
			{
				score1= score1 + rand.nextInt(11)+1;
				System.out.println("Your score is now :" +score1);	
			}		
			if (score1<15 && p == 2)
			{
			System.out.println("You cannot stick below 15. Twist again.");
			}
			else if (p == 2)
			{
				System.out.println("Your score is still :" +score1);			
		}
		}
			
		if ((p != 1) && (p !=2)) 
		{
			System.out.println("error, p=" + p);	
		}
			
		if (score1>=22 && (p != 2))
		{
			System.out.println("You've gone bust!");
		}


		for (int i =1; i<15; i++)     // Insert spaces so Player 2 cannot see Player 1's score
		{
			System.out.println();
		}


		System.out.println("Player 2: Your hand is:" +score2);

		int q = 1;

		while ((q != 2) && (score2<22) || (q == 2 && score2<15))
		{	
			System.out.println("Player 2: 1 for Twist, 2 for Stick");

			q = scanner.nextInt();
			if (q == 1)
			{
				score2= score2 + rand.nextInt(11)+1;
				System.out.println("Your score is now :" +score2);	
			}		
			if (score2<15 && q == 2)
			{
			System.out.println("You cannot stick below 15. Twist again.");
			}
			else if (q == 2)
			{
				System.out.println("Your score is still :" +score2);			
			}
		}
		
		if ((q != 1) && (q !=2)) 
		{
			System.out.println("error, q=" + q);	
		}
		if (score2>=22 && (q != 2))
		{
			System.out.println("You've gone bust!");
		}

		
			System.out.println();
		
		while ((q == 2 && p == 2) || (q == 2 && score1 > 21) || (p == 2 && score2 >21) || (score1 > 21 && score2>21))
		{

			if ((21 - score1 < 0) && (21 - score2 < 0))                              // Both scores higher than 21
			{		
				System.out.println("Player 1's score:" + score1);
				System.out.println("Player 2's score:" + score2);
				System.out.println("You both lose!");
				break;
			}
			else if ((21 - score1 ) < (21 - score2) && (21 - score1 > 0))             // Both scores under 21, Player 1's is nearer to 21
			{	
				System.out.println("Player 1's score:" + score1);
				System.out.println("Player 2's score:" + score2);
				System.out.println("Player 1 wins!");
				break;
			}
			else if ((21 - score1) >= 0 && (21 - score2 < 0))						// Player 1 makes legal score, Player 2 is over 21
			{
				System.out.println("Player 1's score:" + score1);
				System.out.println("Player 2's score:" + score2);
				System.out.println("Player 1 wins!");
				break;
			}
			else if ((21 - score1) < 0 && (21 - score2 >= 0))							// Player 2 makes legal score, Player 1 is over 21
			{
				System.out.println("Player 1's score:" + score1);
				System.out.println("Player 2's score:" + score2);
				System.out.println("Player 2 wins!");
				break;
			}
			else if ((21 - score1 ) > (21 - score2) && (21 - score2 > 0))						// Both scores under 21, Player 2's is nearer to 21
			{	
				System.out.println("Player 1's score:" + score1);
				System.out.println("Player 2's score:" + score2);
				System.out.println("Player 2 wins!");
				break;
			}
			else if ((21 - score1) == (21 - score2) && (21 - score1 >= 0) && (21 - score2 >= 0))         // Both players tie and are less than or equal to 21
			{
				System.out.println("Player 1's score:" + score1);
				System.out.println("Player 2's score:" + score2);
				System.out.println("It's a tie!");
				break;
			}
		}
		if (scanner != null)
			scanner.close();
	}
}


