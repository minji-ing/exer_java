package quicksort;

public class QuickSort {
		
	public static void sort(int[] arr, int s, int e) {
		int i = s;
		int j = e;
		int mid = arr[(s+e)/2];
		
		// 두 부분으로 나뉘기 전까지 진행되는 루프
		while(i <= j) {
			while(arr[i] < mid) i++; // 시작에서 정렬 가운데 값보다 작으면 계속 진행
			while(arr[j] > mid) j--; // 끝에서 정렬 가운데 값보다 크면 계속 진행
			if(i <= j) { // 정렬 가운데 값과 비교하는 루프가 멈췄을 때 인덱스 비교
				// 좌우 정렬 값 바꿔주기
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				// 좌우 값 바꿔준 이후 이어서 진행
				i++;
				j--;
			}
		}
		// 두 부분으로 나눈 후 재귀함수 사용하여 루프 진행
		if(s < j) {
			sort(arr, s, j);
		}
		if(e > i) {
			sort(arr, i, e);
		}
		
	}
	
	// 정렬 완료 후 출력
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
