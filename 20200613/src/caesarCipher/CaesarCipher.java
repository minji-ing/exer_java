package caesarCipher;

public class CaesarCipher {
	public static String caesar(String s, int n) {
		String answer;
		int a = (int)'a';
		int z = (int)'z';
		int A = (int)'A';
		int Z = (int)'Z';
		char[] temp = s.toCharArray();
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] >= a && temp[i] < z) {
				temp[i] = (char)((int)temp[i]+n);
			} else if(temp[i] == z) {
				temp[i] = (char)(a+(int)temp[i]+n-z-1);
			} else if(temp[i] >= A && temp[i] < Z) {
				temp[i] = (char)((int)temp[i]+n);
			} else if(temp[i] == Z){
				temp[i] = (char)(A+(int)temp[i]-Z-1);
			} else {
				temp[i] = temp[i];
			}
		}
		answer = new String(temp);
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		String answer = CaesarCipher.caesar(s, n);
		System.out.println(answer);
	}
}
