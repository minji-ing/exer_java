package clockwiseArray;

import java.util.Scanner;

public class ClockwiseArrayMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("2�̻��� �ڿ����� �Է����ּ���.");
		int num = input.nextInt();
		input.close();
		
		ClockwiseArray arr = new ClockwiseArray(num);
		
		arr.make();
		arr.print();
	}
}
