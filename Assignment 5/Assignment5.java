 //*******************************************************************
//  The class or method name: season
//
// Description of the class or method purpose
//By: Jessica Lam
//Date 10/28/19
//*******************************************************************

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGPA();
		
	}

	public static void printGPA() {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a student record: ");
		
		String name = console.next();
		int count = console.nextInt();
		double totalScores = 0;
		
		 for (int i = 1; i <= count; i++) {
			double scores = console.nextInt();
			totalScores += scores;
			
		}
		System.out.println(name + "'s grade is: " + totalScores/count);
	}

}

	