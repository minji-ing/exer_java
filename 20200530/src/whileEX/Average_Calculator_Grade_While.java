package whileEX;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Average_Calculator_Grade_While {
	// ������ ���� ����
	public static void main(String[] args) {
		int[] key = new int[6];
		Map <Integer, String> scores = new HashMap <Integer, String>(6);
		Scanner input = new Scanner(System.in);
		int i = 0;
		
		key[0] = 95;
		key[1] = 90;
		key[2] = 85;
		key[3] = 80;
		key[4] = 70;
		key[5] = 60;
		
		scores.put(key[0],"A+");
		scores.put(key[1],"A");
		scores.put(key[2],"B+");
		scores.put(key[3],"B");
		scores.put(key[4],"C");
		scores.put(key[5],"D");
		
		System.out.println("������ �Է����ּ���. �ش��ϴ� ������ �˷��帳�ϴ�.");
		int sample = input.nextInt();
		input.close();
		while(i <= key.length) {
			if(sample >= key[i]) {
				System.out.println("������ " + sample + "���� �л��� ������ " + scores.get(key[i]) + "�Դϴ�.");
				break;
			} else if (sample < 60) {
				System.out.println("������ 60 �̸��̹Ƿ� ������ F�Դϴ�.");
				break;
			}
			i++;
		}		
	}
}

