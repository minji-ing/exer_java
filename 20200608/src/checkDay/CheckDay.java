package checkDay;

public class CheckDay {
	public static String check(int a, int b) {
		int end = 0;
		String answer = "";
		for(int i = 1; i < a; i++) {
			if(i == 2) {
				end = end + 29;
			} else if(i == 4 || i == 6 || i == 9 || i == 11) {
				end = end + 30;
			} else {
				end = end + 31;
			}
		}
		end = end + b;
		int modNum = end % 7;
		
		if(modNum == 1) {
			answer = "FRI";
		} else if(modNum == 2) {
			answer = "SAT";
		} else if(modNum == 3) {
			answer = "SUN";
		} else if(modNum == 4) {
			answer = "MON";
		} else if(modNum == 5) {
			answer = "TUE";
		} else if(modNum == 6) {
			answer = "WED";
		} else {
			answer = "THU";
		}
		return answer;
	}
}
