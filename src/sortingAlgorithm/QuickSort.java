package sortingAlgorithm;

import java.util.ArrayList;

public class QuickSort<T extends Comparable<T>> {

	public ArrayList<T> sorting(ArrayList<T> list) {
		int pivot;
		ArrayList<T> left = new ArrayList<>(), right = new ArrayList<>(), result = new ArrayList<>();
		if (list.size() <= 1)
			
			return list;
		
			
		else {
			pivot = list.size() - 1;
			for (int x = 0; x < list.size()-1; x++) {
				if (list.get(x).compareTo(list.get(pivot)) <= 0) {
					left.add(list.get(x));
				}else {
					right.add(list.get(x));
				}
			}
			
			left = sorting(left);
			right = sorting(right);
			
			for(int x = 0; x < left.size(); x++) {
				result.add(left.get(x));
			}
			
			result.add(list.get(pivot));
			
			for(int x = 0; x < right.size(); x++) {
				result.add(right.get(x));
			}
			
			return result;
		}
	}

}
