package hanoi;

public class HanoiMain {
	public static void main(String[] args) {
		int tray = 2;
		Hanoi ha = new Hanoi();
		ha.moveHanoi(tray, 'a', 'b', 'c');
		ha.count();
	}
}
