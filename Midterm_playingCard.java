//*******************************************************************


//  The method name: playingCards
//
// Description of the class or method purpose:
// This method takes shorthand user input and returns the
// long hand equivalent of each rank and suit.
//By: Jessica Lam
//Date: 10/28/19
//*******************************************************************

import java.util.Scanner;
public class Midterm_playingCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a card (rank, suit): ");
		String rank = console.next();
		String suit = console.next();
		
		playingCards(rank, suit);
		playingCards("a", "h");
		
		console.close();

	}
	
	public static void playingCards(String rank, String suit) {


		if (rank.equalsIgnoreCase("a")) {
			System.out.print("Ace");
		}
		else if (rank.equalsIgnoreCase("2")) {
			System.out.print("Two");
		}
		else if (rank.equalsIgnoreCase("3")) {
			System.out.print("Three");
		}
		else if (rank.equalsIgnoreCase("4")) {
			System.out.print("Four");
		}
		else if (rank.equalsIgnoreCase("5")) {
			System.out.print("Five");
		}
		else if (rank.equalsIgnoreCase("6")) {
			System.out.print("Six");
		}
		else if (rank.equalsIgnoreCase("7")) {
			System.out.print("Seven");
		}
		else if (rank.equalsIgnoreCase("8")) {
			System.out.print("Eight");
		}
		else if (rank.equalsIgnoreCase("9")) {
			System.out.print("Nine");
		}
		else if (rank.equalsIgnoreCase("10")) {
			System.out.print("Ten");
		}
		else if (rank.equalsIgnoreCase("j")) {
			System.out.print("Jack");
		}
		else if (rank.equalsIgnoreCase("q")) {
			System.out.print("Queen");
		}
		else if (rank.equalsIgnoreCase("k")) {
			System.out.print("King");
		}
		
		if (suit.equalsIgnoreCase("c")) {
			System.out.println(" of Clubs");
		}
		else if (suit.equalsIgnoreCase("d")) {
			System.out.println(" of Diamonds");
		}
		else if (suit.equalsIgnoreCase("h")) {
			System.out.println(" of Hearts");
		}
		else if (suit.equalsIgnoreCase("s")) {
			System.out.println(" of Spades");
		}
		System.out.println();
		
	}
	
}
