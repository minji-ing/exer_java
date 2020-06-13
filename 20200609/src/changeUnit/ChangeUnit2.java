package changeUnit;

public class ChangeUnit2 {
	public static void main(String[] args) {
		String[] unit = {"Cm", "M", "Inch", "Feet", "Yard", "Mile"};
		double[] len = {1.0, 100.0, 2.54, 30.48, 91.44, 160934.4};
		String[][] result = new String[7][7];

		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				if(i == 0) {
					if(j == 0) {
						result[i][j] = "";
					} else {
						result[i][j] = unit[j-1]+"\t";
					}
				} else {
					if(j == 0) {
						result[i][j] = unit[i-1];
					} else if(j == 1){
						result[i][j] = String.format("%.12f", len[i-1]);
					} else if(j == 2) {
						result[i][j] = String.format("%.12f", len[i-1]/100);
					} else if(j == 3) {
						result[i][j] = String.format("%.12f", len[i-1]/2.54);
					} else if(j == 4) {
						result[i][j] = String.format("%.12f", len[i-1]/30.48);
					} else if(j == 5) {
						result[i][j] = String.format("%.12f", len[i-1]/91.44);
					} else {
						result[i][j] = String.format("%.12f", len[i-1]/160934.4);
					}
				}
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
