package pattern;

import java.util.Scanner;

public class PatternMain {
	public static void main(String[] args) {
		System.out.println("1 �̻� �ڿ����� �Է����ּ���.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		String result = Pattern.make(n);
		System.out.println(result);
	}
}
