package findMaxNum;
// ���α׷��ӽ� ���� �̾�ٿ� ���� ū �� �����
public class FindMaxNum {
	public static void main(String[] args) {
		String answer = ""; // ����� �����ϴ� ����
		int[] num = {6,600,2, 62};
		String[] strNum = new String[num.length]; // �־��� ���� �迭 string���� �������� �迭
		
		for(int i = 0; i < strNum.length; i++) {
			strNum[i] = String.valueOf(num[i]); // int �迭 string �迭�� ����
		}
		
		// �迭�� �յڸ� �ٿ��� �� ���� ���Ͽ� ���� ū ������ ����
		for(int i = 0; i < strNum.length-1; i++) {
			for(int j = i+1; j < strNum.length; j++) {
				int a = Integer.parseInt(strNum[i]+strNum[j]);
				int b = Integer.parseInt(strNum[j]+strNum[i]);
				
				if(a < b) {
					String tmp = strNum[i];
					strNum[i] = strNum[j];
					strNum[j] = tmp;
				}
			}
		}
		
		// ���� ù��° �迭 ���� "0" �̶�� answer�� "0"�� return
		if(strNum[0].equals("0")) {
			answer += "0";
		} else { // �ƴ϶�� answer�� �ϳ��� ����
			for(int i = 0; i < strNum.length; i++) {
				answer += strNum[i];
			}
		}
		System.out.println(answer);
	}
}
