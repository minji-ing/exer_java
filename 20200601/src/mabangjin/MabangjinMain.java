package mabangjin;

import java.util.Scanner;

public class MabangjinMain {
	public static void main(String[] args) {
		System.out.println("4�� ��� �� �ϳ��� �Է��ϼ���.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		Mabangjin arr = new Mabangjin(n);
		arr.make();
		arr.print();
	}
}
