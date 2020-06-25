package harshadNum;

public class HarshadNum {
	public static void main(String[] args) {
		int x = 12;
		String strX = Integer.toString(x);
		char[] cut = strX.toCharArray();
		boolean answer = true;
		int temp = 0;
		
		for(int i = 0; i < cut.length; i++) {
			temp += Character.getNumericValue(cut[i]);
		}
		if(x%temp != 0) {
			answer = false;
		}
		System.out.print(answer);
	}
}
