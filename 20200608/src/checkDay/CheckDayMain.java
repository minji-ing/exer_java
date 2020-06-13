package checkDay;

import java.util.Scanner;

public class CheckDayMain {
	public static void main(String[] args) {
		System.out.println("요일을 확인하고 싶은 월을 숫자로 입력해주세요.");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("요일을 확인하고 싶은 일을 숫자로 입력해주세요.");
		int b = input.nextInt();
		input.close();
		
		String result = CheckDay.check(a, b);
		System.out.println("입력하신 "+a+"월 "+b+"일의 요일은 "+result+"입니다.");
	}
}
