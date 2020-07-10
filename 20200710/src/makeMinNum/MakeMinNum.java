package makeMinNum;
// 길이가 같은 배열 두 개의 값을 조합하여 최솟값 만들기
public class MakeMinNum {
	public static int make(int[] a, int[] b) {
		int answer = 0; // 최솟값 저장하는 변수
		// a,b 두 배열 quikSort 메소드 사용하여 오름차순으로 정렬
		a = quikSort(a);
		b = quikSort(b);
		for(int i = 0; i < a.length; i++) {
			// (a 배열 작은 수 -> 큰 수) * (b 배열 큰 수 -> 작은 수)
			answer += a[i]*b[b.length-1-i];
		}
		return answer;
	}
	
	// 배열 오름차순 정렬하는 메소드
	public static int[] quikSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]> arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {3,4};
		int answer = MakeMinNum.make(a, b);
		System.out.println(answer);
	}
}
