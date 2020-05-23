package starprint;

public class StarPrint {

	public static void main(String[] args) {
		int lineCount = 5;
		int spaceCount = lineCount / 2 + 1;
		int starCount = 1;
		
		for(int i=0; i<lineCount; i++) {
			for(int j=0; j<=spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j=0; j<=spaceCount; j++) {
				System.out.print(' ');
			}
			System.out.println();
			if(i<=1) {
				spaceCount = spaceCount - 1;
				starCount = starCount + 2;
			} else {
				spaceCount = spaceCount + 1;
				starCount = starCount -2;
			}
		}
	}
}
