package countryOf124;
// ���α׷��ӽ� 124����
public class CountryOf124 {
	public static void main(String[] args) {
		String answer = ""; // ���� ���� string
		int n = 20;
		int div = 0;		// n % 3 ���� ����
		
		while(n > 0) {
			div = n % 3;
			n /= 3;
			
			if(div == 0) {
				n--;
				div = 4;
			}
			answer = div + answer;
		}
		
		System.out.println(answer);
	}
}
