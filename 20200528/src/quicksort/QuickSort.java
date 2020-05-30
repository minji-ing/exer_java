package quicksort;

public class QuickSort {
		
	public static void sort(int[] arr, int s, int e) {
		int i = s;
		int j = e;
		int mid = arr[(s+e)/2];
		
		// �� �κ����� ������ ������ ����Ǵ� ����
		while(i <= j) {
			while(arr[i] < mid) i++; // ���ۿ��� ���� ��� ������ ������ ��� ����
			while(arr[j] > mid) j--; // ������ ���� ��� ������ ũ�� ��� ����
			if(i <= j) { // ���� ��� ���� ���ϴ� ������ ������ �� �ε��� ��
				// �¿� ���� �� �ٲ��ֱ�
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				// �¿� �� �ٲ��� ���� �̾ ����
				i++;
				j--;
			}
		}
		// �� �κ����� ���� �� ����Լ� ����Ͽ� ���� ����
		if(s < j) {
			sort(arr, s, j);
		}
		if(e > i) {
			sort(arr, i, e);
		}
		
	}
	
	// ���� �Ϸ� �� ���
	public static void print(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]+"]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
}
