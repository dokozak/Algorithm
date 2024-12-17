package sortingAlgorithm;

public class initiator {
	
	//Type of sorting
	private static BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>();
	private static MergeSort<Integer> mergeSort = new MergeSort<Integer>();
	
	public static void main(String[] args) {
		Integer[] list = {7};
		
		
		//mergeSort.sorting(list);
		bubbleSort.sorting(list);
		
		comprobeTheResult(list);
	}
	
	
	private static void comprobeTheResult(Integer[] list) {
		System.out.print("[");
		
		for(int x = 0; x< list.length; x++) {
			System.out.print(list[x] + ",");
		}
		
		System.out.print("]");
	}
}
