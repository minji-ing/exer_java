package counterclockwise;

import java.util.Scanner;

public class CounterClockwiseMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("2이상의 자연수를 입력하세요.");
		int num = input.nextInt();
		input.close();
		
		CounterClockwise arr = new CounterClockwise(num);
		
		arr.make();
		arr.print();
	}
}
