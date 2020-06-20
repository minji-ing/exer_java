package squareRoot;
// ������ �Ǻ��ϱ�
public class SquareRoot {
	public long find(long n) {
		long answer = 0;
		// n�� ������ ��ȯ
		long i = (long)Math.sqrt(n);
		// Math.sqrt�� double ���·� ��ȯ�ϱ� ������ long ����ȯ ��
		// ���� �������� ���� �ʴ� ���� n�� ���� �߻�
		if(i*i == n) {
			answer = (i+1)*(i+1);
		} else {
			answer = -1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		long n = 121;
		SquareRoot root = new SquareRoot();
		long answer = root.find(n);
		System.out.print(answer);
	}
}
