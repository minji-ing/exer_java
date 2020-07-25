package naverTest;

public class NameCheck {
	public boolean solution(String[] name) {
		boolean answer = false;
		
		for(int i = 0; i < name.length-1; i++) {
			for(int j = i+1; j < name.length; j++) {
				if(name[j].indexOf(name[i]) > -1) {
					answer = true;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] name = {"a","b","ABC"};
		NameCheck chk = new NameCheck();
		boolean answer = chk.solution(name);
		System.out.println(answer);
	}
}
