package sixMabangjin;

import java.util.Scanner;

public class SixMabangjinMain {
	public static void main(String[] args) {
		System.out.println("6이상의 짝수 중 2로 나누어 홀수가 되는 수를 입력하세요.\n"
				+ "ex) 6, 10, 14 등");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		SixMabangjin arr = new SixMabangjin(n);
		arr.make();
		arr.print();
	}
}
