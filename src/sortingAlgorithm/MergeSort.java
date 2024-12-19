package sortingAlgorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeSort<T extends Comparable<T>> {

	public ArrayList<T> sorting(ArrayList<T> list) {
		ArrayList<T> right = new ArrayList<>(), left = new ArrayList<>();

		if (list.size() <= 1)
			return list;
		else {
			float mid = list.size() / 2;
			mid =  (mid / 1f == 0.5f) ?  mid-0.5f: mid;

			for (int x = 0; x < mid; x++) {
				left.add(list.get(x));
				
			}
			for (int x = 0; x < list.size() - mid; x++) {
				right.add(list.get((int) (x + mid)));
			}

			left = sorting(left);
			right = sorting(right);

			if (left.get(left.size() - 1).compareTo(right.get(0)) < 0) {

				for (int x = 0; x < right.size(); x++) {
					left.add(right.get(x));
				}
				return left;
			}
			return merge(left, right);
		}

	}

	public ArrayList<T> merge(ArrayList<T> left, ArrayList<T> right) {
		ArrayList<T> result = new ArrayList<>();
		int x1 = 0, x2 = 0;

		while (x1 != left.size() && x2 != right.size()) {
			if (left.get(x1).compareTo(right.get(x2)) < 0) {
				result.add(left.get(x1));
				x1++;
			} else {
				result.add(right.get(x2));
				x2++;
			}
		}
		if (x1 != left.size()) {
			while (x1 != left.size()) {
				result.add(left.get(x1));
				x1++;
			}
		} else {
			while (x2 != right.size()) {
				result.add(right.get(x2));
				x2++;
			}
		}
		return result;
	}

}
