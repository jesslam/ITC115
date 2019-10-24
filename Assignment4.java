//*******************************************************************h
//  Class repl
//
// Description of the class or method purpose:
// Receive user input and number of times to concatenate input
// Print concatenated input
//By: Jessica Lam
//Date: 10/21/19
//*******************************************************************

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		//obtain user input for word
		System.out.println("Type a word: ");
		String word = console.nextLine();
		
		//obtain user input number of times word will repeat
		System.out.println("Type a number: ");
		int number = console.nextInt();
		
		repl(word, number);
		//repl(word, number);
				
	}
	
	public static String repl(String input, int times) {		
		
		for (int i = 1; i <= times; i++) {
	        if (i < 0) {
	            System.out.println(" ");
	        } else {
	        	System.out.print(input);
	        }  
		}
		System.out.println();
		return (input);
	}
	
}
