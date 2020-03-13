package deckproblem;
import java.util.Scanner;
import java.util.Random;
public class DeckOfCards {
	
	//VARIABLES.
	int noOfCards;
	int iteration1;
	int iteration2;
	int randomNumber1;
	int randomNumber2;
	String playerCards;
	
	private void deckOfCards()
	{
		Scanner sc  = new Scanner(System.in);
		Random random = new Random();
		String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
		String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		noOfCards = suits.length * ranks.length;
		String [][] deck = new String[suits.length][ranks.length];
		String [] player = {"++Player1++", "++Player2++","++Player3++","++Player4++"};
		
		for(iteration1 = 0 ; iteration1 < suits.length ; iteration1++)
		{
			for(iteration2 = 0 ; iteration2 < ranks.length ; iteration2++)
			{
				deck[iteration1][iteration2] = ranks[iteration2];
			}
		}
		for(iteration1 = 0 ; iteration1 < suits.length ; iteration1++)
		{
			for(iteration2 = 0 ; iteration2 < ranks.length ; iteration2++)
			{
				System.out.print(deck[iteration1][iteration2]+" "); 
			}
			System.out.println();
		}
		for(iteration1 = 0 ; iteration1 < suits.length ; iteration1++)
		{
			System.out.println(player[iteration1]);
			System.out.println();
			for (iteration2 = 0 ;iteration2 < ranks.length ; iteration2++)
			{
				randomNumber1 = random.nextInt(4);
				randomNumber2 = random.nextInt(12);
				playerCards = deck[randomNumber1][randomNumber2];
				System.out.println(suits[randomNumber1]+" of "+ playerCards);
			}
			System.out.println();
		}
	}
	
	public  static void main(String[] args)
	{
		DeckOfCards cards = new DeckOfCards();
		cards.deckOfCards();
	}
}
