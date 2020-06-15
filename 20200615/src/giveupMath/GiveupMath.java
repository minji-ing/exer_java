package giveupMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GiveupMath {
	public int[] chk(int[] answers) {
		int len = answers.length;
		int[] a = {1,2,3,4,5}; // a ������ ���� ����
		int[] b = {2,1,2,3,2,4,2,5}; // b ������ ���� ����
		int[] c = {3,3,1,1,2,2,4,4,5,5}; // c ������ ���� ����
		List<Integer> count = new ArrayList<Integer>(); // 3�� �л��� ���� ���� ������ ����Ʈ
		int[] answer; // 3���� ���� ���� ���Ͽ� ���� ���� �л� ������ �迭

		// count ����Ʈ �ʱ�ȭ
		for(int i = 0; i < 3; i++) {
			count.add(0);
		}
		// �������� ������ ���� ���Ͽ� ���� ���� count
		for(int i = 0; i < len; i++) {	
			if(answers[i] == a[i%5]) {
				count.set(0, count.get(0)+1);
			}
			if(answers[i] == b[i%8]) {
				count.set(1, count.get(1)+1);
			}
			if(answers[i] == c[i%10]) {
				count.set(2, count.get(2)+1);
			}
		}
		// ���� ���� ���� ���
		int max = Collections.max(count);
		
		// ���� ���� ���� ����� ������ �ִ��� Ȯ�� �� ������ ����Ʈ�� ����
		List<Integer> sameCount = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++) {
			if(max == count.get(i)) {
				sameCount.add(i+1);
			}
		}
		// �����ڱ��� Ȯ�� �� �л� �迭�� ����
		answer = new int[sameCount.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = sameCount.get(i);
		}
		// ������ ���� ��� ������������ ����
		Arrays.sort(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		GiveupMath arr = new GiveupMath();
		int[] answer = arr.chk(answers);
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+"\t");
		}
		
	}
}
