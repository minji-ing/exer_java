package hanoi;

public class Hanoi {

	private int count = 0; //�̵� Ƚ��
	
	public Hanoi() {

	}
	/* n�� ���� �̵� ����
	 * �� �Ʒ� ���ø� ������ ������ ���� �̵��� n-1�� ���ø� �̵� ��Ű�� �Ͱ� ����
	 * ����, n-1�� ���ø� �߰� ���� ����� �̵���Ų ��
	 * �� �Ʒ� ���ø� ���� ���뿡 �̵�, ���� �ٽ� n-1�� ���ø� ���� ���뿡 �̵�
	 * ���� Ƚ�� = (n-1�� ���� �̵� Ƚ��)+1+(n-1�� ���� �̵� Ƚ��) 
	 */
	public void moveHanoi(int tray, char from, char to, char mid) {
		if(tray == 1) {
			count++;
			System.out.println(from + " bar -> " + to + " bar");
		} else if(tray%2 == 0) {
			moveHanoi(tray-1, from, to, mid);
			count++;
			System.out.println(from + " bar -> " + mid + " bar");
			moveHanoi(tray-1, mid, to, from);
		}
	}
	public void count() {
		System.out.println("�� �̵� Ƚ�� : " + count + "��");
	}
}
