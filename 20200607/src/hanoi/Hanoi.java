package hanoi;

public class Hanoi {

	private int count = 0; //이동 횟수
	
	public Hanoi() {

	}
	/* n개 접시 이동 원리
	 * 맨 아래 접시를 제외한 나머지 접시 이동은 n-1개 접시를 이동 시키는 것과 동일
	 * 따라서, n-1개 접시를 중간 지점 막대로 이동시킨 후
	 * 맨 아래 접시를 최종 막대에 이동, 이후 다시 n-1개 접시를 최종 막대에 이동
	 * 최종 횟수 = (n-1개 접시 이동 횟수)+1+(n-1개 접시 이동 횟수) 
	 */
	public void moveHanoi(int tray, char from, char to, char mid) {
		if(tray == 1) {
			count++;
			System.out.println(from + " bar -> " + to + " bar");
		} else if(tray%2 == 0) {
			moveHanoi(tray-1, from, to, mid);
			count++;
			System.out.println(from + " bar -> " + mid + " bar");
			moveHanoi(tray-1, mid, to, from);
		}
	}
	public void count() {
		System.out.println("총 이동 횟수 : " + count + "번");
	}
}
