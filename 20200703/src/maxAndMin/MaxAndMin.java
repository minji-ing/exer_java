package maxAndMin;

// 문자열에서 최댓값과 최솟값 찾기
public class MaxAndMin {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		String[] cutS = s.split(" "); // 문자열 띄어쓰기 기준으로 잘라서 string 배열에 저장
		
		// 잘라서 저장한 string 배열 크기 비교하여 정렬하기
		for(int i = 0; i < cutS.length-1; i++) {
			for(int j = i+1; j < cutS.length; j++) {
				if(Integer.parseInt(cutS[i]) > Integer.parseInt(cutS[j])) {
					String tmp = cutS[i];
					cutS[i] = cutS[j];
					cutS[j] = tmp;
				}
			}
		}
		// 정렬한 배열 중 첫번째와 마지막 값 반환
		String answer = cutS[0]+" "+cutS[cutS.length-1];
		System.out.println(answer);
	}
}
