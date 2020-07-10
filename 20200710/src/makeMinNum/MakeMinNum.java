package makeMinNum;

import java.util.Arrays;
// ���̰� ���� �迭 �� ���� ���� �����Ͽ� �ּڰ� �����
public class MakeMinNum {
	public static int make(int[] a, int[] b) {
		int answer = 0; // �ּڰ� �����ϴ� ����
		// a,b �� �迭 ������������ ����
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0; i < a.length; i++) {
			// (a �迭 ���� �� -> ū ��) * (b �迭 ū �� -> ���� ��)
			answer += a[i]*b[b.length-1-i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {3,4};
		int answer = MakeMinNum.make(a, b);
		System.out.println(answer);
	}
}
