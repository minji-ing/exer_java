package giveupMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GiveupMath {
	public int[] chk(int[] answers) {
		int len = answers.length;
		int[] a = {1,2,3,4,5}; // a 수포자 답지 패턴
		int[] b = {2,1,2,3,2,4,2,5}; // b 수포자 답지 패턴
		int[] c = {3,3,1,1,2,2,4,4,5,5}; // c 수포자 답지 패턴
		List<Integer> count = new ArrayList<Integer>(); // 3명 학생의 맞은 개수 저장할 리스트
		int[] answer; // 3명의 맞은 개수 비교하여 많이 맞춘 학생 저장할 배열

		// count 리스트 초기화
		for(int i = 0; i < 3; i++) {
			count.add(0);
		}
		// 정답지와 각각의 답지 비교하여 맞은 개수 count
		for(int i = 0; i < len; i++) {	
			if(answers[i] == a[i%5]) {
				count.set(0, count.get(0)+1);
			}
			if(answers[i] == b[i%8]) {
				count.set(1, count.get(1)+1);
			}
			if(answers[i] == c[i%10]) {
				count.set(2, count.get(2)+1);
			}
		}
		// 가장 많이 맞춘 사람
		int max = Collections.max(count);
		
		// 가장 많이 맞춘 사람과 동점자 있는지 확인 후 있으면 리스트에 저장
		List<Integer> sameCount = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++) {
			if(max == count.get(i)) {
				sameCount.add(i+1);
			}
		}
		// 동점자까지 확인 후 학생 배열에 리턴
		answer = new int[sameCount.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = sameCount.get(i);
		}
		// 동점자 있을 경우 오름차순으로 정렬
		Arrays.sort(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		GiveupMath arr = new GiveupMath();
		int[] answer = arr.chk(answers);
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+"\t");
		}
		
	}
}
