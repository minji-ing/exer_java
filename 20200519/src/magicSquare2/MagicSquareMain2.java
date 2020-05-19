package magicSquare2;

import java.util.Scanner;

public class MagicSquareMain2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("3이상의 홀수를 입력하세요.");
		int num = input.nextInt();
		input.close();
		
		MagicSquare2 square = new MagicSquare2(num);
		square.make();
		square.print();
	}
}
