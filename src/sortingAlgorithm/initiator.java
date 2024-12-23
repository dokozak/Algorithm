package sortingAlgorithm;

import java.util.ArrayList;
import java.util.Random;

public class initiator {
	
	//Type of sorting
	private static BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();
	private static MergeSort<Integer> mergeSort = new MergeSort<Integer>();
	private static QuickSort<Integer> quickSort = new QuickSort<Integer>();
	private static MyOldQuickSort<Integer> oldQuickSort = new  MyOldQuickSort<Integer>();
	
	public static void main(String[] args) {
		//quickSort();
		//oldQuickSort();
		//mergeSort();
		//bubbleSort();
		
	}
	
	private static void quickSort() {
		//List of the number
		Integer[] list = getArray(100);
		//Method of sorting
		quickSort.sorting(list, 0, list.length - 1);
		//Result
		comprobeTheResult(list);
	}
	
	private static void oldQuickSort() {
		//List of the number
		ArrayList <Integer> list2 = getArrayList(100);
		//Method of sorting
		list2 = oldQuickSort.sorting(list2);
		//Result
		comprobeTheResultArrayList(list2);
	}
	
	
	private static void mergeSort() {
		//List of the number
		ArrayList <Integer> list2 = getArrayList(100);
		//Method of sorting
		list2 = mergeSort.sorting(list2);
		//Result
		comprobeTheResultArrayList(list2);
	}
	
	private static void bubbleSort() {
		//List of the number
		Integer[] list = getArray(100);
		//Method of sorting
		bubbleSort.sorting(list);
		//Result
		comprobeTheResult(list);
	}
	
	
	private static ArrayList<Integer> getArrayList(int size){
		ArrayList <Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for(int x = 0; x< size; x++) {
			list.add(random.nextInt(0, 101));
		}
		return list;
	}

	private static Integer[] getArray(int size){
		Integer [] list = new Integer[size];
		Random random = new Random();
		for(int x = 0; x< list.length; x++) {
			list[x] = random.nextInt(0, 101);
		}
		return list;
	}
	
	private static void comprobeTheResult(Integer[] list) {
		System.out.print("[");
		
		for(int x = 0; x< list.length; x++) {
			System.out.print(list[x] + ",");
		}
		
		System.out.print("]");
	}
	
	private static void comprobeTheResultArrayList(ArrayList<Integer> list) {
		System.out.print("[");
		for(int x = 0; x< list.size(); x++) {
			System.out.print(list.get(x) + ",");
		}
		
		System.out.print("]");
	}
}
