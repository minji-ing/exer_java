package findMaxNum;

import java.util.Arrays;
import java.util.Comparator;

// ���α׷��ӽ� ���� ū �� ���۸��� Ǯ��
public class FindMaxNumAnother {
	public static void main(String[] args) {
		String answer = "";
		int[] num = {6,600,2, 62};
		String[] strNum = new String[num.length];
		
		for(int i = 0; i < strNum.length; i++) {
			strNum[i] = String.valueOf(num[i]);
		}
		
		// �������̽� comparator�� �������Ͽ� s2+s1���� �������� ����
		Arrays.sort(strNum, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2+s1).compareTo(s1+s2);
			}
		});
		
		if(strNum[0].equals("0")) {
			answer += "0";
		} else {
			for(int i = 0; i < strNum.length; i++) {
				answer += strNum[i];
			}
		}
		
		System.out.println(answer);
	}
}
