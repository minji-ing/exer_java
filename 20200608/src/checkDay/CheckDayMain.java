package checkDay;

import java.util.Scanner;

public class CheckDayMain {
	public static void main(String[] args) {
		System.out.println("������ Ȯ���ϰ� ���� ���� ���ڷ� �Է����ּ���.");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("������ Ȯ���ϰ� ���� ���� ���ڷ� �Է����ּ���.");
		int b = input.nextInt();
		input.close();
		
		String result = CheckDay.check(a, b);
		System.out.println("�Է��Ͻ� "+a+"�� "+b+"���� ������ "+result+"�Դϴ�.");
	}
}
