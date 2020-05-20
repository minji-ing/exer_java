package clockwiseArray;

import java.util.Scanner;

public class ClockwiseArrayMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("2이상의 자연수를 입력해주세요.");
		int n = input.nextInt();
		input.close();
		
		ClockwiseArray arr = new ClockwiseArray(n);
		
		arr.make();
		arr.print();
	}
}
