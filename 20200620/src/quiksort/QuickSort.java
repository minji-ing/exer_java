package quiksort;

public class QuickSort {
	public static int partition(int[] n, int start, int end) {
		/*배열의 100개의 숫자 중 mid 숫자 찾기 */
		int mid = n[(start + end) / 2];
		
		while(start < end) {
			while((n[start] < mid) && (start < end))
				start++;
			while((n[end] > mid) && (start < end))
				end--;
			if(start < end) {
				int tmp = n[start];
				n[start] = n[end];
				n[end] = tmp;
			}
		}
		return start;
	}
	public static void quickSort(int[] n, int start, int end) {
		if(start < end) {
			int newMid = partition(n, start, end);
			
			quickSort(n, start, newMid-1);
			quickSort(n, newMid+1, end);
		}
	}
	public static void print(int [] n) {
		for(int i = 0; i < n.length; i++) {
			System.out.print(n[i]+ " ");
		}
		System.out.println();
	}
}
