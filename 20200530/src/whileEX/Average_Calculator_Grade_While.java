package whileEX;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Average_Calculator_Grade_While {
	// 점수별 학점 계산기
	public static void main(String[] args) {
		int[] key = new int[6];
		Map <Integer, String> scores = new HashMap <Integer, String>(6);
		Scanner input = new Scanner(System.in);
		int i = 0;
		
		key[0] = 95;
		key[1] = 90;
		key[2] = 85;
		key[3] = 80;
		key[4] = 70;
		key[5] = 60;
		
		scores.put(key[0],"A+");
		scores.put(key[1],"A");
		scores.put(key[2],"B+");
		scores.put(key[3],"B");
		scores.put(key[4],"C");
		scores.put(key[5],"D");
		
		System.out.println("점수를 입력해주세요. 해당하는 학점을 알려드립니다.");
		int sample = input.nextInt();
		input.close();
		while(i <= key.length) {
			if(sample >= key[i]) {
				System.out.println("점수가 " + sample + "점인 학생의 학점은 " + scores.get(key[i]) + "입니다.");
				break;
			} else if (sample < 60) {
				System.out.println("점수가 60 미만이므로 학점은 F입니다.");
				break;
			}
			i++;
		}		
	}
}

