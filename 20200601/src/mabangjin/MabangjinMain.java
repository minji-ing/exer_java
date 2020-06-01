package mabangjin;

import java.util.Scanner;

public class MabangjinMain {
	public static void main(String[] args) {
		System.out.println("4의 배수 중 하나를 입력하세요.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		Mabangjin arr = new Mabangjin(n);
		arr.make();
		arr.print();
	}
}
