package carpetSize;
// 프로그래머스 카펫 사이즈 찾기
public class CarpetSize {
	public static void main(String[] args) {
		int brown = 10; // 테두리 갈색 블록 개수
		int yellow = 2; // 가운데 노랑 블록 개수
		int[] answer = new int[2]; // 카펫 가로, 세로 길이 저장 배열
		
		// 가운데 노랑 블록이 1일 경우 카펫은 무조건 3,3 길이
		if(yellow == 1) {
			answer[0] = 3;
			answer[1] = 3;
		} else {
			for(int i = 1; i <= yellow; i++) { // 그 외의 경우 가운데 노랑 블록의 공배수 찾기
				if(yellow%i == 0) {
					int j = yellow / i;
					if((i+j)*2+4 == brown && i >= j) { // 노랑 블록의 공배수 중 가로인 j가 세로인 i보다 크거나 같고 노랑 블록의 둘레가 갈색 블록의 개수와 같다면 저장
						answer[0] = i+2;
						answer[1] = j+2;
					}
				}
			}	
		}
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+"\t");
		}
	}
}
