package quicksort;

public class QuickSortMain {
	public static void main(String[] args) {
		int[] array = {5,6,3,7,4,8,2,9};
		
		QuickSort.sort(array, 0, array.length-1);
		QuickSort.print(array);
	}
}
