package secretMap;

public class SecretMap {
	public String[] make(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			String binary1 = Integer.toBinaryString(arr1[i]);
			String binary2 = Integer.toBinaryString(arr2[i]);
			
			for(int j = 0; j < n; j++) {
				if(binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
					answer[i] += "#";
				}
				if(binary1.charAt(j) == '0' && binary2.charAt(j) == '0') {
					answer[i] += " ";
				}
				System.out.print(answer[i]);
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		SecretMap map = new SecretMap();
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		String[] answer = map.make(5, arr1, arr2);
	}
}
