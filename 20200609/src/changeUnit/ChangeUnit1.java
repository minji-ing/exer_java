package changeUnit;

public class ChangeUnit1 {
	public static void main(String[] args) {
		String[] unit = {"Cm", "M", "Inch", "Feet", "Yard", "Mile"};
		double[] len = {1.0, 100.0, 2.54, 30.48, 91.44, 160934.4};
		
		for(int i = 0; i < unit.length; i++) {
			System.out.print("\t"+unit[i]+"\t");
		}
		System.out.println();
		
		for(int i = 0; i < len.length; i++) {
			double[] change = {len[i], len[i]/100, len[i]/2.54,
					len[i]/30.48, len[i]/91.44, len[i]/160934.4};
			System.out.printf("%-5s",unit[i]);
			for(int j = 0; j < change.length; j++) {
				System.out.printf("%.12f\t", change[j]);
			}
			System.out.println();
		}
	}
}
