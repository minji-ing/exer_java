package amicable;

import java.util.HashMap;
import java.util.Map;

public class Amicable {
	public int a;
	public int count = 0;
	Map<Integer, Integer> match = new HashMap<Integer, Integer>();
	
	//�ڽ��� ������ ��� �� ���ϱ�
	public int sum(int num) {
		int sum = 0;
		
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				sum = sum + i;
			}
		}
		sum = sum + 1;
		return sum;
	}
	
	//ģȭ�� Ȯ��
	public Map<Integer, Integer> chk(int a) {
		this.a = a;
		for(int i = 1; i <= a; i++) {
			for(int j = i+1; j <= a; j++) {
				if(sum(i) == j && sum(j) == i && i != j) {
					match.put(i, j);
					count++;
				}
			}
		}
		return match;
	}
	
	public void print() {
		System.out.println("1���� "+a+" ���� ���� ģȭ��");
		for(int key : match.keySet()) {
			int value = match.get(key);
			System.out.println(key +":"+value);
		}
		System.out.println("���� �� �� ģȭ���� ������ "+count+"�� �̴�.");
	}
}
