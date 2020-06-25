package budget;

import java.util.Arrays;
// 최대한 많은 사람에게 예산 할당하기
public class Budget {
	public static void main(String[] args) {
		int[] d = {2,2,3,3}; // 원하는 예산의 배열
		int budget = 10; // 총 예산
		int answer = 0; // 줄 수 있는 사람 수
		int sum = 0; // 최대한 사람들에게 주는 예산의 합
		
		Arrays.sort(d); // 원하는 예산 오름차순으로 정렬
		
		for(int i = 0; i < d.length; i++) {
			sum += d[i];
			answer ++;
			// 사람들의 예산을 다 더하고 사람 수도 카운트하다가
			// 원하는 예산의 합이 총 예산보다 커지면 멈추고 마지막 사람 -1
			if(sum > budget) {
				answer --;	
			}
		}		
		System.out.println(answer);
	}
}
