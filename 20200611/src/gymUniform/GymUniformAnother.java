package gymUniform;
// 체육복 빌려주기 다른 사람 코드
public class GymUniformAnother {
	public static int rent(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int [] std = new int[n+1]; // 1~n까지 인덱스 사용
		
		// std 배열 초기화
		for(int i = 1; i <= n; i++) {
			std[i] = 1;
		}
		// 도둑맞은 학생 0으로 변경
		for(int l : lost) {
			std[l]--;
		}
		// 여벌 있는 학생 2로 변경
		for(int r : reserve) {
			std[r]++;
		}
		
		// 없는 친구에게 빌려주기
		for(int i = 1; i <= n; i++) {
			if(std[i] == 0) {
				if(i+1 <= n && std[i+1] == 2) {
					std[i+1]--;
					std[i]++;
				} else if(i-1 >= 1 && std[i-1] == 2) {
					std[i-1]--;
					std[i]++;
				}
			}
		}
		
		// std 배열 값이 1 이상인 학생 체크
		for(int i = 1; i <= n; i++) {
			if(std[i] >= 1) {
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] lost = {2,4};
		int[] reverse = {1,3,5};
		int result = GymUniformAnother.rent(5, lost, reverse);
		System.out.println(result);
	}
}
