package carpetSize;
// ���α׷��ӽ� ī�� ������ ã��
public class CarpetSize {
	public static void main(String[] args) {
		int brown = 10; // �׵θ� ���� ��� ����
		int yellow = 2; // ��� ��� ��� ����
		int[] answer = new int[2]; // ī�� ����, ���� ���� ���� �迭
		
		// ��� ��� ����� 1�� ��� ī���� ������ 3,3 ����
		if(yellow == 1) {
			answer[0] = 3;
			answer[1] = 3;
		} else {
			for(int i = 1; i <= yellow; i++) { // �� ���� ��� ��� ��� ����� ����� ã��
				if(yellow%i == 0) {
					int j = yellow / i;
					if((i+j)*2+4 == brown && i >= j) { // ��� ����� ����� �� ������ j�� ������ i���� ũ�ų� ���� ��� ����� �ѷ��� ���� ����� ������ ���ٸ� ����
						answer[0] = i+2;
						answer[1] = j+2;
					}
				}
			}	
		}
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+"\t");
		}
	}
}
