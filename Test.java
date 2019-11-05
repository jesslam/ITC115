import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
//		File f = new File("hamlet.txt");
//		System.out.println("Exists returns: " + f.exists());
//		System.out.println("Can read returns: " + f.canRead());
//		System.out.println("Length returns: " + f.length());
//		System.out.println("Absolute path returns: " + f.getAbsolutePath());
		
//		try {
//		//write to a file
//		PrintStream output = new PrintStream(new File("hello.txt"));
//		
//		output.println("Hello world");
//		output.println();
//		output.println("This program produces");
//		output.println("four lines of output");
//		output.println("the old content is gone");
//		
//		output.close();
//		
//	} catch (Exception e) {
//		System.out.println(e.getMessage());
//	}
		
//		Scanner input = new Scanner(new File("weather.txt"));
//		double prev = input.nextDouble(); //fencepost
//		while (input.hasNext()) {
//			if (input.hasNextDouble()) {
//				double next = input.nextDouble();
//				System.out.println(prev + " to " + next + 
//						", change = " + (next - prev));
//				prev = next;
//			} else {
//				input.next();
//			}
//
		Scanner input = new Scanner(new File("hours2.dat"));
		while (input.hasNextLine()) {
			String text = input.nextLine();
			processLine(text);
		}
			
	}
		
		//Processes the given String (id, name and hours worked)
		public static void processLine(String text) {
			Scanner data = new Scanner(text);
			int id = data.nextInt();
			String name = data.next();
			double sum = 0.0;
			while (data.hasNextDouble()) {
				sum += data.nextDouble();
			}
			System.out.println("Total hours worked by " + name + 
					" (ID #" + id + ") = " + sum);
		}
		
	}


