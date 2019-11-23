//*******************************************************************

//  The class or method name: isSorted
//
// Description of the class or method purpose:
// This method will check an array against a sorted version of itself
// to determine true if the original was sorted or false if not.
//By: Jessica Lam 
//Date: 11/18/19
//*******************************************************************

//import java.lang.Math;
public class Assign8sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double [] list1 = {1, 5, 3, 2, 7};
		double [] list2 = {1, 3, 7, 8, 10};
		double[] list1 = { 4.0, 3.0, 2.6, 6.3, 5.7 };

		System.out.println(isSorted(list2));
		System.out.println(isSorted(list1));
	}
	
	public static boolean isSorted(double[] list) {
		for (int i = 0; i <list.length-1; i++) {
			if (list[i+1] < list[i]) {
				return false;
			}		
		} return true;
	}
}