package sortingAlgorithm;

import java.util.ArrayList;

public class MergeSort<T extends Comparable<T>> {

	/**
	 * This method sorting the list with using the algorithm MergeSort
	 * 
	 * @param list - list of the elements who be sorting
	 */
	public ArrayList<T> sorting(ArrayList<T> list) {
		// Create two array one to the right values and other to left values
		ArrayList<T> right = new ArrayList<>(), left = new ArrayList<>();

		// Break the recurrence if the size list is equals than 1
		if (list.size() <= 1)
			return list;
		// Continue the recurrence
		else {
			// Get the mid size of the list
			float mid = list.size() / 2;
			mid = (mid / 1f == 0.5f) ? mid - 0.5f : mid;

			// Add first-mid element to left
			for (int x = 0; x < mid; x++) {
				left.add(list.get(x));

			}
			// Add mid-last element to right
			for (int x = 0; x < list.size() - mid; x++) {
				right.add(list.get((int) (x + mid)));
			}
			// They continue dividing until the value that is called is returned but ordered
			left = sorting(left);
			right = sorting(right);
			// Check if the last value left is smallest than first right value because if is
			// true only add right elements to left
			if (left.get(left.size() - 1).compareTo(right.get(0)) < 0) {
				//Add all right values to left list
				for (int x = 0; x < right.size(); x++) {
					left.add(right.get(x));
				}
				//Returns the sorted values
				return left;
			}
			//This method sort the values and return the list sorted
			return merge(left, right);
		}

	}

	/**
	 * This method get the right and left list and order this list
	 * @param left - left list
	 * @param right - right list 
	 * @return result - the list of the ordered union of the elements of the left and right list
	 */
	public ArrayList<T> merge(ArrayList<T> left, ArrayList<T> right) {
		//Result list
		ArrayList<T> result = new ArrayList<>();
		//x1 is for left list and x2 is for right list
		int x1 = 0, x2 = 0;
		//As long as x1 or x2 do not exceed the size of your list, this loop will not end.
		while (x1 != left.size() && x2 != right.size()) {
			//Checks if left(x1) is less than right(x2), if true add left, if not add right
			if (left.get(x1).compareTo(right.get(x2)) < 0) {
				//Add left and continue
				result.add(left.get(x1));
				x1++;
			} else {
				//Add right and continue
				result.add(right.get(x2));
				x2++;
			}
		}
		//Check what list has been ended
		if (x1 != left.size()) {
			//Add all rest values to left
			while (x1 != left.size()) {
				result.add(left.get(x1));
				x1++;
			}
		} else {
			//Add all rest values to right
			while (x2 != right.size()) {
				result.add(right.get(x2));
				x2++;
			}
		}
		//Return the sorting values
		return result;
	}

}
