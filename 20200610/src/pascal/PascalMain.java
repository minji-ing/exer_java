package pascal;

import java.util.Scanner;

public class PascalMain {
	public static void main(String[] args) {
		System.out.println("�Ľ�Į �ﰢ���� �� ���� ���̸� �ڿ����� �Է��ϼ���.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		Pascal arr = new Pascal(n);
		arr.make();
		arr.print();
	}
}
