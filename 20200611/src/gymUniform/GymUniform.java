package gymUniform;
// 체육복 빌려주기
public class GymUniform {
	public static int rent(int n, int[] lost, int[] reverse) {
		// 체육복 있는 사람 수
		int answer = n - lost.length;
		
		// 도난 당한 사람과 여벌 있는 사람 동일인인지 확인
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reverse.length; j++) {
				if(lost[i] == reverse[j]) {
					lost[i] = -10;
					reverse[j] = -10;
					answer++;
				}
			}
		}
		// 여벌 있는 사람이 없는 사람에게 빌려주고 총 수업인원 카운트
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reverse.length; j++) {
				if(lost[i] == reverse[j]-1 || 
						lost[i] == reverse[j]+1) {
					answer++;
					reverse[j] = -10;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] lost = {1,2,6};
		int[] reverse = {1,2,5};
		int result = GymUniform.rent(7, lost, reverse);
		System.out.println(result);
		// 이 코드가 근데 프로그래머스에서는 실패로 나옴....
	}
}
