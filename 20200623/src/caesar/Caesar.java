package caesar;

public class Caesar {
	public static String make(String s, int n) {
		String answer = "";
		char[] cut = s.toCharArray();
		
		for(int i = 0; i < cut.length; i++) {
			if(cut[i] == ' ') {
				continue;
			} else {
				if((int)cut[i] < 97 && (int)cut[i]+n > 90) {
					cut[i] = (char)((int)cut[i]+n-(int)'Z'+(int)'A'-1);
				} else if((int)cut[i]+n > 122) {
					cut[i] = (char)((int)cut[i]+n-(int)'z'+(int)'a'-1);
				} else {
					cut[i] = (char)((int)cut[i]+n);
				}
			}
		}
		
		answer = new String(cut);
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "a B W";
		int n = 10;
		String answer = Caesar.make(s, n);
		
		System.out.print(answer);
	}
}
