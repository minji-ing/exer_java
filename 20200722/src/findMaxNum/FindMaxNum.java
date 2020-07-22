package findMaxNum;
// 프로그래머스 정수 이어붙여 가장 큰 수 만들기
public class FindMaxNum {
	public static void main(String[] args) {
		String answer = "";
		int[] num = {6,600,2, 62};
		String[] strNum = new String[num.length];
		
		for(int i = 0; i < strNum.length; i++) {
			strNum[i] = String.valueOf(num[i]);
		}
		
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
		
		for(int i = 0; i < strNum.length; i++) {
			answer += strNum[i];
		}
		
		System.out.println(answer);
	}
}
