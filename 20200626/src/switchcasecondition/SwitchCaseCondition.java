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
		System.out.println("�̱�, �߱�, �Ϻ� �� ȯ���� ���Ͻô� ���� �Է����ּ���.");
		Scanner input = new Scanner(System.in);
		String temp = input.next();
		String country = null;
		switch(temp) {
		case "�̱�" : country = "USD";		
			break;
		case "�߱�" : country = "CNY";
			break;
		case "�Ϻ�" : country = "JPY";
			break;
		}
		System.out.println("ȯ���Ͻ� �ݾ��� �Է����ּ���.");
		int won = input.nextInt();
		double money = won / toMoney(country);
		System.out.printf("KRW %s => %s %.2f\n", won, country, money);
		input.close();
	}
}
