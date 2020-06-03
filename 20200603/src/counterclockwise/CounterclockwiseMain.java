package counterclockwise;

import java.util.Scanner;

public class CounterclockwiseMain {
	public static void main(String[] args) {
		System.out.println("2이상의 자연수를 입력하세요.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		Counterclockwise arr = new Counterclockwise(n);
		arr.make();
		arr.print();
	}
}
