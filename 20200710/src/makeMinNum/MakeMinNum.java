package makeMinNum;
// ���̰� ���� �迭 �� ���� ���� �����Ͽ� �ּڰ� �����
public class MakeMinNum {
	public static int make(int[] a, int[] b) {
		int answer = 0; // �ּڰ� �����ϴ� ����
		// a,b �� �迭 quikSort �޼ҵ� ����Ͽ� ������������ ����
		a = quikSort(a);
		b = quikSort(b);
		for(int i = 0; i < a.length; i++) {
			// (a �迭 ���� �� -> ū ��) * (b �迭 ū �� -> ���� ��)
			answer += a[i]*b[b.length-1-i];
		}
		return answer;
	}
	
	// �迭 �������� �����ϴ� �޼ҵ�
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
