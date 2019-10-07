
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a = 1;
		int b = a + (a-a);
		//int count = 12;
		
		for (int i = 1; i <= 12; i++) {
			System.out.println(a);
			int sum = a + b;
			a = b;
			b = sum;
		}

	}
}