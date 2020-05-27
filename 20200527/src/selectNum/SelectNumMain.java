package selectNum;

public class SelectNumMain {
	public static void main(String[] args) {
		SelectNum sel = new SelectNum();
		int[] arr = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3},{3,5,2}};
		
		sel.print(sel.make(arr, commands));		
	}
}
