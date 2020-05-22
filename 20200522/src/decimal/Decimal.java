package decimal;

public class Decimal {
	
	public int solution(int n) {
		int answer = 0;
		int[] num = new int[n+1];
		
		//2부터 n까지의 수를 배열에 입력
		for(int i = 2; i <= n; i++) {
			num[i] = i;
		}
		//2부터 그의 배수를 0으로 변경. 이후 0이면 continue
		for(int i = 2; i <= n; i++) {
			if(num[i] == 0) {
				continue;
			}
			for(int j = 2*i; j <= n; j += i) {
				num[j] = 0;
			}
		}
		
		//배열에서 0이 아닌 것들의 개수 count
		for(int i = 0; i < num.length; i++) {
			if(num[i] != 0) {
				answer++;
			}
		}
		return answer;
	}
}
