package sixMabangjin;

import java.util.Scanner;

public class SixMabangjinMain {
	public static void main(String[] args) {
		System.out.println("6�̻��� ¦�� �� 2�� ������ Ȧ���� �Ǵ� ���� �Է��ϼ���.\n"
				+ "ex) 6, 10, 14 ��");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		SixMabangjin arr = new SixMabangjin(n);
		arr.make();
		arr.print();
	}
}
