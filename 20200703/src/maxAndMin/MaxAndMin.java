package maxAndMin;

public class MaxAndMin {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		String[] cutS = s.split(" ");
		
		for(int i = 0; i < cutS.length-1; i++) {
			for(int j = i+1; j < cutS.length; j++) {
				if(Integer.parseInt(cutS[i]) > Integer.parseInt(cutS[j])) {
					String tmp = cutS[i];
					cutS[i] = cutS[j];
					cutS[j] = cutS[i];
				}
			}
		}
		
		for(int i = 0; i < cutS.length; i++) {
			System.out.print(cutS[i]);
		}
//		System.out.println(answer);
	}
}
