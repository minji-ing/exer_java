package findMaxNum;
// 프로그래머스 정수 이어붙여 가장 큰 수 만들기
public class FindMaxNum {
	public static void main(String[] args) {
		String answer = ""; // 결과값 저장하는 변수
		int[] num = {6,600,2, 62};
		String[] strNum = new String[num.length]; // 주어진 숫자 배열 string으로 재저장할 배열
		
		for(int i = 0; i < strNum.length; i++) {
			strNum[i] = String.valueOf(num[i]); // int 배열 string 배열로 저장
		}
		
		// 배열의 앞뒤를 붙였을 때 숫자 비교하여 가장 큰 수부터 정렬
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
		
		// 제일 첫번째 배열 값이 "0" 이라면 answer에 "0"만 return
		if(strNum[0].equals("0")) {
			answer += "0";
		} else { // 아니라면 answer에 하나씩 저장
			for(int i = 0; i < strNum.length; i++) {
				answer += strNum[i];
			}
		}
		System.out.println(answer);
	}
}
