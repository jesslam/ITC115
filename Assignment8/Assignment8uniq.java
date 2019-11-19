import java.util.Arrays;

public class Assignment8uniq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list1 = {4, 7, 2, 5, 3, 7, 8};
		int[] list2 = {15, 9, 10, 5, 7, 34};
		isUnique(list1);

	}

	public static void isUnique(int[] list) {
		for (int i = 0; i <= list.length; i++) {
			i = list[i];
			//System.out.print(i);
			int compare = i++;
			System.out.println(compare);
			if (i != compare) {
				System.out.print(true);
			} else {
				System.out.print(false);
			}
		}
	}

}
