import java.util.Scanner;
public class If10_14_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
//		System.out.println("Enter gpa: ");
//		double gpa = console.nextDouble();
//		if (gpa >= 2.0) {
//			System.out.println("Application accepted.");
//		}
//		else {
//			System.out.println("Application denied.");
//		}
//		System.out.println("After the if statement");
		
//		System.out.print("What percentage did you earn? ");
//		int percent = console.nextInt();
//		if (percent >= 90) {
//			System.out.println("You got an A!");
//		}
//		else if (percent >= 80) {
//			System.out.println("You got a B!");
//		}
//		else if (percent >= 70) {
//			System.out.println("You got a C!");
//		}
//		else if (percent >= 60) {
//			System.out.println("You got a D!");
//		}
//		else {
//			System.out.println("You got an F!");
//		}
		
		System.out.println("How many numbers do you have? ");
		int negatives = 0; //initialize from 0 to add each negative
		int sum = 0; //initialize from 0 to add each entered number
		int count = console.nextInt();
		//int num = console.nextInt();
		for (int i = 1; i <= count; i++) {
			int newNum = console.nextInt();
			System.out.println("#"+ i +"? " + count);
			
			sum += newNum;
			if (i <= count) {
				System.out.println("average: " + sum / count);
				System.out.println("");
			}
			if (i < 0) {
				System.out.println(negatives + newNum);
			}
			
		}
		console.close();
	}
	
}
