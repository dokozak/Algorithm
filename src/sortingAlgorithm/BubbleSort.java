package sortingAlgorithm;

/**
 * 
 * @author Jorge Navarro Martinez
 *
 * @param <T> The value to be order
 */
public class BubbleSort<T extends Comparable<T>> {

	/**
	 * This method sorting the list with using the algorithm Bubble Sort
	 * 
	 * @param list - list of the elements who be sorting
	 */
	public void sorting(T[] list) {
		//Check if the list contains 2 or more values
		if(list.length<=1)
			return;
		// Boolean that check if this list is sorting
		boolean isSort = false;
		// While the list isn´t sort the program don´t ending
		while (!isSort) {
			//The ultimate number who be check
			int lastComprobe = list.length - 1;
			// Move the numbers if (x > x + 1) from the list
			for (int x = 0; x < lastComprobe; x++) {

				// Check if the first value is greater than the second value
				if (list[x].compareTo(list[x + 1]) > 0) {
					// Move the first position to x+1 and second position to x
					T firstValue = list[x];
					T secondValue = list[x + 1];
					list[x] = secondValue;
					list[x + 1] = firstValue;

				}
			}

			// Check if the list is sorted
			int x = 0;
			// Don´t check the ultimate number because always is right
			lastComprobe--;
			while (x < lastComprobe) {

				// Check if the first value is greater than the second value and if the first
				// value
				// is greater than second value break this while and continue the program
				if (list[x].compareTo(list[x + 1]) > 0)
					x = list.length;

				x++;

			}
			// If the program enter in this if indicate the list is sorting
			if (x == lastComprobe)
				isSort = true;
				
		}

	}

}
