import java.util.Arrays;
public class Arrays111319 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		double[][] temp = new double[4][5];
//		temp[0][0] = 98.3;
//		temp[0][1] = 85.1;
//		temp[0][2] = 77.4;
//		temp[0][3] = 70.5;
//		temp[0][4] = 88.9;
//		temp[2][3] = 42;
//		temp[1][4] = 77;	
//		
//		print(temp);
//	}
//	// print the values of the array
//	// need a nested loop
//	
//	public static void print(double[][] temp) {
//		for (int i = 0; i < temp.length; i++) {
//			
//			for (int j = 0; j < temp[i].length; j++) {
//				System.out.print(temp[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String[] args) {
//	    int [] a1 = {4, 15, 8};
//	    int [] a2 = a1;
//	    a2[0] = 7;
//	    
//	    System.out.println(Arrays.toString(a1));
//
//}
	
	//reverse numbers in an array
	public static void main(String[] args) {
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;	  
		}
		System.out.println(Arrays.toString(nums));
		reverse(nums);
		System.out.println(Arrays.toString(nums));
	}

		public static void reverse(int[] numbers) {
			for (int i = 0; i < numbers.length / 2; i++) {
				int temp = numbers[i];
				numbers[i] = numbers[numbers.length - 1 - i];
				numbers[numbers.length - 1 - i] = temp; 
			}
		}
}
