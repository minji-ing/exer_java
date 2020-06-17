package phoneNum;
// 전화번호 뒷자리 4개 제외하고 모두 별로 바꾸기
public class PhoneNum {
	public String change(String phoneNum) {
		String answer = "";
		
		for(int i = 0; i < phoneNum.length(); i++) {
			if(i < phoneNum.length() - 4) {
				answer += "*";
			} else {
				answer += phoneNum.charAt(i);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		PhoneNum num = new PhoneNum();
		String phoneNum = "027778888";
		String answer = num.change(phoneNum);
		System.out.print(answer);
	}
}
