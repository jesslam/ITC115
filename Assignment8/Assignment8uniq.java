//*******************************************************************

//  The class or method name: isUnique
//
// Description of the class or method purpose:
// This method will iterate through an array, checking each current 
// index value against the next index value to see if there is a duplicate.
// If so, the array is considered not unique.
//By: Jessica Lam 
//Date: 11/18/19
//*******************************************************************
import java.util.Arrays;

public class Assignment8uniq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list1 = { 4, 7, 2, 5, 3, 7, 8 };
		int[] list2 = { 15, 9, 10, 5, 7, 34 };
		int[] list3 = {};
		int[] list4 = { 7 };
		System.out.println(isUnique(list1));
		System.out.println(isUnique(list4));

	}

	public static boolean isUnique(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length - 1; j++) {

				if (list[i] == list[j]) {
					return false;

				}
			}

		}
		return true;
	}

}
