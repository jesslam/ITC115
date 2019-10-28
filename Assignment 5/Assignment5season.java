 //*******************************************************************
//  The class or method name: season
//
// Description of the class or method purpose
//By: Jessica Lam
//Date 10/28/19
//*******************************************************************

import java.util.Scanner;

public class Assignment5season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a month (1-12): ");
		System.out.println("Enter a day (1-31): ");
		season(3,20);
		season(12,16);
		season(9,10);
		
	}
	public static int season(int month, int day) {
		if ((month == 12 && day >= 16) || (month <= 3 && day <= 15)) {
			System.out.println("winter");
		}
		else if ((3 <= month && day >= 16) || (month <= 6 && day <= 15)) {
			System.out.println("spring");
		}
		else if((6 <= month && day >= 16) || (month <= 9 && day <= 15)) {
			System.out.println("summer");
		}
		else if ((9 <= month && day >= 16) || (month == 12 && day <= 15)) {
			System.out.println("fall");
		}
		return (month);
	}
}
