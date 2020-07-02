package secretMap;

public class SecretMap {
	public String[] make(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			String binary1 = "";
			String binary2 = "";
			int j = 1;
			while(j < n) {
				binary1 += Integer.toString(arr1[i]%2);
				binary2 += Integer.toString(arr2[i]%2);
				if(j < n-1) {
					arr1[i] = arr1[i]/2;
					arr2[i] = arr2[i]/2;
				} else {
					binary1 += arr1[i]/2;
					binary2 += arr2[i]/2;
				}
				j++;
			}
			String revBin1 = new StringBuilder(binary1).reverse().toString();
			String revBin2 = new StringBuilder(binary2).reverse().toString();
			
			for(int k = 0; k < n; k++) {
				if(k == 0) {
					if(revBin1.charAt(k) == '1' || revBin2.charAt(k) == '1') {
						answer[i] = "#";
					} else if(revBin1.charAt(k) == '0' && revBin2.charAt(k) == '0') {
						answer[i] = " ";
					}
				} else {
					if(revBin1.charAt(k) == '1' || revBin2.charAt(k) == '1') {
						answer[i] += "#";
					} else if(revBin1.charAt(k) == '0' && revBin2.charAt(k) == '0') {
						answer[i] += " ";
					}
				}
			}
			System.out.println(answer[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		SecretMap map = new SecretMap();
		int n = 5;
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		
		map.make(n, arr1, arr2);
	}
}