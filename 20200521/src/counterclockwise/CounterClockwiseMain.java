package counterclockwise;

import java.util.Scanner;

public class CounterClockwiseMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("2�̻��� �ڿ����� �Է��ϼ���.");
		int num = input.nextInt();
		input.close();
		
		CounterClockwise arr = new CounterClockwise(num);
		
		arr.make();
		arr.print();
	}
}
