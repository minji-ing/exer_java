package switchcasecondition;

import java.util.Scanner;

public class SwitchCaseCondition {
	public static double toMoney(String c) {
		double tot = 0.00;
		switch(c) {
		case "USD" : tot = 1250.00;
			break;
		case "JPY" : tot = 1165.34;
			break;
		case "CNY" : tot = 177.41;
			break;
		default : tot = 1;
			break;
		}
		return tot;
	}
	public static void main(String[] args) {
		System.out.println("미국, 중국, 일본 중 환전을 원하시는 나라를 입력해주세요.");
		Scanner input = new Scanner(System.in);
		String temp = input.next();
		String country = null;
		switch(temp) {
		case "미국" : country = "USD";		
			break;
		case "중국" : country = "CNY";
			break;
		case "일본" : country = "JPY";
			break;
		}
		System.out.println("환전하실 금액을 입력해주세요.");
		int won = input.nextInt();
		double money = won / toMoney(country);
		System.out.printf("KRW %s => %s %.2f\n", won, country, money);
		input.close();
	}
}
