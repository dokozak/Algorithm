package sortingAlgorithm;

import java.util.ArrayList;
import java.util.Random;

public class initiator {
	
	//Type of sorting
	private static BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();
	private static MergeSort<Integer> mergeSort = new MergeSort<Integer>();
	
	public static void main(String[] args) {
		//Integer[] list = {7, 1, 44, 666, 2, 4, 6, 8, 11};
		ArrayList <Integer> list2 = getArrayList();
		
		
		//list2 = mergeSort.sorting(list2);
		//bubbleSort.sorting(list);
		
		//comprobeTheResult(list);
		comprobeTheResultArrayList(list2);
	}
	
	
	private static ArrayList<Integer> getArrayList(){
		ArrayList <Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for(int x = 0; x< 10; x++) {
			list.add(random.nextInt(0, 101));
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
