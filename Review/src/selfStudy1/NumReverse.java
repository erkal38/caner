package selfStudy1;

import java.util.ArrayList;

public class NumReverse {

	public static void main(String[] args) {
		int[] arr = { 10, 8, 9, 7 };
		sortingArray(arr);
	}
	public static void sortingArray(int[] arr) {
		ArrayList<Integer> list = new ArrayList();
		for (int each : arr) {
			list.add(each);
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) < list.get(j)) {
					Integer temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println(list);
	}
}
