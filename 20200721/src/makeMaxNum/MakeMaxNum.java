package makeMaxNum;
// 프로그래머스 큰 수 만들기(탐욕법) - 수정필
public class MakeMaxNum {
	public static String make(String num, int k) {
		String answer = "";
		char[] cutNum = num.toCharArray();
		
		for(int i = 0; i < cutNum.length-1; i++) {
			for(int j = i+1; j < cutNum.length; j++) {
				if((int)cutNum[i] < (int)cutNum[j]) {
					char tmp = cutNum[i];
					cutNum[i] = cutNum[j];
					cutNum[j] = tmp;
				}
			}
		}
		
		int diff = cutNum.length - k;
		for(int i = 0; i < diff; i++) {
			answer += cutNum[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String num = "4177252841";
		int k = 4;
		String answer = MakeMaxNum.make(num, k);
		System.out.println(answer);
	}
}
