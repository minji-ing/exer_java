package pattern;

public class Pattern {
	public static String make(int n) {
		String answer = "";
		
		for(int i = 1; i <= n; i++) {
			if(i%2 == 0) {
				answer += "¹Ú";
			} else {
				answer += "¼ö";
			}
		}
		return answer;
	}
}
