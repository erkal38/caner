package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZer {

	public static void main(String[] args) {
		int[] num = { 1, 0, 2, 0, 3, 4 };
		moveZero(num);
	}

	public static int[] moveZero(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		int countZero = 0;

		for (int each : arr) {

			list.add(each);
			if (each == 0) {
				countZero++;
			}
			continue;
		}

		list.removeAll(Arrays.asList(0));
		System.out.println(list);

	int[]ark = new int[arr.length];

		for (int i = 0; i < ark.length - countZero; i++) {

			ark[i] = list.get(i);
			System.out.println(Arrays.toString(ark));

		}

		System.out.println(Arrays.toString(ark));
		return arr;

	}

}
