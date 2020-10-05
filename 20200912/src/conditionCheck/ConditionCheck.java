package conditionCheck;

import java.util.Arrays;

public class ConditionCheck {
	public int[] make(String[] info, String[] query) {
		int[] answer = new int[query.length];
		boolean chk = false;
		int count = 0;
		
		for(int i = 0; i < query.length; i++) {
			String[] cutQuery = query[i].split(" and ");
			// - and backend and senior and - 150
			for(int j = 0; j < info.length; j++) {
				String[] cutInfo = info[j].split(" ");
				
				for(int z = 0; z < cutQuery.length-1; z++) {
					if(cutQuery[z].equals("-") || cutInfo[z].equals(cutQuery[z])) {
						chk = true;
					} else {
						chk = false;
						break;
					}
				}
				if(chk == true) {
					String[] cutLast = cutQuery[cutQuery.length-1].split(" ");
					
					if((cutLast[0].equals("-") || cutLast[0].equals(cutInfo[cutInfo.length-2])) && Integer.parseInt(cutLast[1]) <= Integer.parseInt(cutInfo[cutInfo.length-1])) {
						chk = true;
					} else {
						chk = false;
					}
				}

				if(chk == true) {
					count++;
				}
			}
			answer[i] = count;
			count = 0;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		
		ConditionCheck chk = new ConditionCheck();
		int[] answer = chk.make(info, query);
		System.out.println(Arrays.toString(answer));
	}
}
