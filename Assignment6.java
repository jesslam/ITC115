//*******************************************************************

//  The class or method name: boyGirl
//
// Description of the class or method purpose:
// This method should scan a text file for input and group alternating 
// lines to either boys or girls based on their line position, then 
// it should add up all the members of each group and finally find
// the absolute difference between groups.
//By: Jessica Lam 
//Date: 11/13/19
//*******************************************************************
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
//import java.io.PrintStream;

public class Assignment6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// confirm file exists in correct directory
		//File in = new File("boysgirls.txt");
		//System.out.println(in.exists());

		// scan file for input
		Scanner input = new Scanner(new File("boysgirls.txt"));
		boyGirl(input);

	}

	public static void boyGirl(Scanner input) throws FileNotFoundException {
		// initialize variables
		int boySum = 0;
		int girlSum = 0;
		int boyCount = 0;
		int girlCount = 0;
		int count = 1;

		// loop through each line of list
		while (input.hasNext()) {
			String list = input.next();
			// System.out.print(list);
			// designate alternating lines group each gender
			if (count % 2 == 0) {
				boyCount++;
				boySum += input.nextInt();
			} else {
				girlCount++;
				girlSum += input.nextInt();
			}
			count++;

		}
		int difference = Math.abs(boySum - girlSum);
		System.out.println(boyCount + " boys, " + girlCount + " girls");
		System.out.println("Difference between boys' and girls' sums: " + difference);

	}

}
