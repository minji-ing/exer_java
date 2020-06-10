package pascal;

import java.util.Scanner;

public class PascalMain {
	public static void main(String[] args) {
		System.out.println("파스칼 삼각형의 한 변의 길이를 자연수로 입력하세요.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		Pascal arr = new Pascal(n);
		arr.make();
		arr.print();
	}
}
