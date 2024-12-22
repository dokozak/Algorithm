package sortingAlgorithm;

import java.util.ArrayList;

/**
 * 
 * @author Jorge Navarro Martinez
 *
 * @param <T> The value to be order
 */
public class QuickSort<T extends Comparable<T>> {

	/**
	 * This method sorting the list with using the algorithm QuickSort
	 * 
	 * @param list - list of the elements who be sorting
	 */
	public ArrayList<T> sorting(ArrayList<T> list) {
		// The last value of the list
		T pivot;
		// Create the list right, left and result.
		ArrayList<T> left = new ArrayList<>(), right = new ArrayList<>(), result;
		// If the list only have a element break the recurrence
		if (list.size() <= 1)

			return list;

		else {
			// Get the last position
			pivot = list.get(list.size() - 1);
			// Compare all values ​​of the list and add value to left list if the value is
			// equals or lower than the last value, or add the value to right list if the
			// value is higher than the last value
			for (int x = 0; x < list.size() - 1; x++) {
				if (list.get(x).compareTo(pivot) <= 0) {
					left.add(list.get(x));
				} else {
					right.add(list.get(x));
				}
			}
			//Create recurrence to get sorted values
			left = sorting(left);
			right = sorting(right);

			//Add values ​​to the result list in this order to create an ordered list
			result = new ArrayList<>(left);
			result.add(pivot);
			result.addAll(right);

			//Return the result
			return result;
		}
	}

}
