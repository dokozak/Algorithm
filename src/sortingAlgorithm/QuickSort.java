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
	public void sorting(T[] list, int start, int end) {

		// If start and end is the same number end the recurrence
		if (start >= end)

			return;

		else {
			// Get the last value
			T finalValue = list[end];
			// Get first movement value
			int movementValue = start;
			// I save a value with this value
			T valueBox;
			// Compare the final value with actual value, if is less than final value change
			// actual value with movement value
			for (int x = movementValue; x < end; x++) {

				if (list[x].compareTo(finalValue) <= 0) {
					//Change the value and change the movementValue
					valueBox = list[x];
					list[x] = list[movementValue];
					list[movementValue] = valueBox;
					movementValue++;

				}

			}

			//Change the final value with movement value
			list[end] = list[movementValue];
			list[movementValue] = finalValue;

			// Sorting the left part of the list
			sorting(list, start, movementValue - 1);

			// Sorting the right part of the list
			sorting(list, movementValue + 1, end);

		}
	}

}
