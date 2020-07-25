package naverTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// array �Ǵ� list �� ����Ͽ� �� �迭�� set ���� ����, ������ ���� ����, ������ ���� ����, ������ ���� ������ ���Ͽ���
public class MakeSet {	
	public int[] solution(int[] arr1, int[] arr2) {
		int[] answer = new int[5]; // ����� �迭
		// �� �迭 �� �ϳ��� �������� ���
		if(arr1.length == 0) {
			answer[0] = arr1.length; // arr1�� set ���� ����
			answer[1] = sameChk(arr2).size(); // arr2�� set ���� ����
			answer[2] = arr2.length; //arr1, arr2 ������ ���� ����
			answer[3] = arr2.length; //arr1, arr2 ������ ���� ����
			answer[4] = arr1.length; //arr1, arr2 ������ ���� ����
		} else if(arr2.length == 0) {
			answer[0] = sameChk(arr1).size(); // arr1�� set ���� ����
			answer[1] = arr1.length; // arr2�� set ���� ����
			answer[2] = arr1.length; //arr1, arr2 ������ ���� ����
			answer[3] = arr1.length; //arr1, arr2 ������ ���� ����
			answer[4] = arr2.length; //arr1, arr2 ������ ���� ����
		} else { //arr1, arr2 ��� �������� �ƴ� ���
			List<Integer> chkArr1 = sameChk(arr1);
			List<Integer> chkArr2 = sameChk(arr2);
			
			answer[0] = chkArr1.size();
			answer[1] = chkArr2.size();
			answer[2] = sum(chkArr1, chkArr2);
			answer[3] = complement(chkArr1, chkArr2);
			answer[4] = intersect(chkArr1, chkArr2);	
		}
		return answer;
	}
	//arr1, arr2 �� �迭�� ���� �� �ߺ� üũ�Ͽ�
	public List<Integer> sameChk(int[] arr) {
		List<Integer> chk = new ArrayList<Integer>();
		chk.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < chk.size(); j++) {
				if(arr[i] == chk.get(j)) {
					break;
				} else if(arr[i] != chk.get(j) && j == chk.size()-1) {
					chk.add(arr[i]);
				}
			}
		}
		return chk;
	}
	public int sum(List<Integer> list1, List<Integer> list2) {
		List<Integer> sumArr = new ArrayList<Integer>();
		for(int i = 0; i < list1.size(); i++) {
			sumArr.add(list1.get(i));
		}
		for(int i = 0; i < list2.size(); i++) {
			sumArr.add(list2.get(i));
		}
		for(int i = 0; i < sumArr.size()-1; i++) {
			for(int j = i+1; j < sumArr.size(); j++) {
				if(sumArr.get(i) == sumArr.get(j)) {
					sumArr.remove(sumArr.get(j));
				}
			}
		}
		return sumArr.size();
	}
	public int complement(List<Integer> list1, List<Integer> list2) {
		List<Integer> comArr = new ArrayList<Integer>();
		for(int i = 0; i < list1.size(); i++) {
			comArr.add(list1.get(i));
		}
		for(int i = 0; i < comArr.size(); i++) {
			for(int j = 0; j < list2.size(); j++) {
				if(comArr.get(i) == list2.get(j)) {
					comArr.remove(i);
					break;
				}
			}
		}
		return comArr.size();
	}
	public int intersect(List<Integer> list1, List<Integer> list2) {
		List<Integer> interArr = new ArrayList<Integer>();
		for(int i = 0; i < list1.size(); i++) {
			for(int j = 0; j < list2.size(); j++) {
				if(list1.get(i) == list2.get(j)) {
					interArr.add(list1.get(i));
					break;
				}
			}
		}
		return interArr.size();
	}
	public static void main(String[] args) {
		MakeSet makeset = new MakeSet();
		int[] arr1 = {1,2,3,2};
		int[] arr2 = {};
		int[] answer = makeset.solution(arr1, arr2);
		
		System.out.println(Arrays.toString(answer));
	}
}
