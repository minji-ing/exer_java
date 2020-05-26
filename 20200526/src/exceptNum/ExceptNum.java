package exceptNum;

public class ExceptNum {
	
	public int[] make(int[] arr) {
		int[] answer;
		
		if(arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
			System.out.print("["+answer[0]+"]");
		} else {
			int min = arr[0];
			for(int i = 0; i < arr.length; i++) {
				min = Math.min(arr[i], min);
			}
			System.out.print("[");
			answer = new int[arr.length -1];
			int j = 0;
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[j] == min) {
					j++;
					i--;
					continue;
				} else {
					answer[i] = arr[j];
					j++;
				}
				if(i == arr.length - 2) {
					System.out.print(answer[i]);
				} else {
					System.out.print(answer[i]+",");
				}
			}
			System.out.print("]");
		}
		return answer;
	}

}
