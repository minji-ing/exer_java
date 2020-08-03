package countryOf124;
// 프로그래머스 124나라
public class CountryOf124 {
	public static void main(String[] args) {
		int n = 56;
		int accumulate = 0;
		int i = 1;
		
		while(i > 0) {
			accumulate += Math.pow(3, i);
			System.out.println(Math.pow(3, i)+":"+accumulate);
			if(accumulate >= n) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}
