package spyClothes;
// 프로그래머스 위장
public class SpyClothes {
	public int make(String[][] clothes) {
		int answer = 0;
		
		for(int i = 0; i < clothes.length; i++) {
			for(int j = 0; j < clothes[i].length; j++) {
				System.out.print(clothes[i][j] + "\t");
			}
			System.out.println();
		}
		return answer;
	}
	public static void main(String[] args) {
		String[][] clothes = {{"yellow-hat", "headgear"}, {"blue-sunglasses", "eyewear"}, {"green-turban", "headgear"}};
		SpyClothes spy = new SpyClothes();
		spy.make(clothes);
	}
}
