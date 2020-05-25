package amicable;

import java.util.HashMap;
import java.util.Map;

public class Amicable {
	public int a;
	public int count = 0;
	Map<Integer, Integer> match = new HashMap<Integer, Integer>();
	
	//자신을 제외한 약수 합 구하기
	public int sum(int num) {
		int sum = 0;
		
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				sum = sum + i;
			}
		}
		sum = sum + 1;
		return sum;
	}
	
	//친화수 확인
	public Map<Integer, Integer> chk(int a) {
		this.a = a;
		for(int i = 1; i <= a; i++) {
			for(int j = i+1; j <= a; j++) {
				if(sum(i) == j && sum(j) == i && i != j) {
					match.put(i, j);
					count++;
				}
			}
		}
		return match;
	}
	
	public void print() {
		System.out.println("1부터 "+a+" 범위 내의 친화수");
		for(int key : match.keySet()) {
			int value = match.get(key);
			System.out.println(key +":"+value);
		}
		System.out.println("범위 내 총 친화수의 갯수는 "+count+"개 이다.");
	}
}
