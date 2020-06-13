package marathon;

import java.util.Arrays;

public class Marathon {
	public static String chk(String[] participant, String[] completion) {
		String answer = "";
		int n = completion.length;
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < n; i++) {
			if(!completion[i].equals(participant[i])) {
				answer = participant[i];
				break;
			}
		}
		if(answer == "") {
			answer = participant[n];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String answer = Marathon.chk(participant, completion);
		System.out.println(answer);
	}
}
