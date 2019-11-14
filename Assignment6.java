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
		
	}
	
	public static void boyGirl(Scanner input) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("boysgirls.txt"));


		int boySum = 0;
		int girlSum = 0;
		int count = 1;

	
	while (scan.hasNext()) {
		
		String list = input.nextLine();
		System.out.println(list);
		
		int boyCount = 0;
		int girlCount = 0;
		
		if (count%2 == 0) {
			boyCount++;
			boySum += scan.nextInt();
		} else {
			girlCount++;
			girlSum += scan.nextInt();
		}


	}
	count++;
	
	int difference = Math.abs(boySum - girlSum);
	System.out.println(boySum + " boys, " + girlSum + " girls");
	System.out.println("Difference between boys' and girls' sums: " +  difference);
	

}
	
	
}


