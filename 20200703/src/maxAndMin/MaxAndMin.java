package maxAndMin;

// ���ڿ����� �ִ񰪰� �ּڰ� ã��
public class MaxAndMin {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		String[] cutS = s.split(" "); // ���ڿ� ���� �������� �߶� string �迭�� ����
		
		// �߶� ������ string �迭 ũ�� ���Ͽ� �����ϱ�
		for(int i = 0; i < cutS.length-1; i++) {
			for(int j = i+1; j < cutS.length; j++) {
				if(Integer.parseInt(cutS[i]) > Integer.parseInt(cutS[j])) {
					String tmp = cutS[i];
					cutS[i] = cutS[j];
					cutS[j] = tmp;
				}
			}
		}
		// ������ �迭 �� ù��°�� ������ �� ��ȯ
		String answer = cutS[0]+" "+cutS[cutS.length-1];
		System.out.println(answer);
	}
}
