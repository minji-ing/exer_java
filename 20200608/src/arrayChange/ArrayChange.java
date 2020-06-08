package arrayChange;

import java.util.ArrayList;
import java.util.List;

public class ArrayChange {
	public static void main(String[] args) {		
		List<Double> len = new ArrayList<Double>();
		len.add(1.0);
		len.add(100.0);
		len.add(2.54);
		len.add(30.48);
		len.add(91.44);
		len.add(160934.4);
		
		List<String> unit = new ArrayList<String>();
		unit.add(" ");
		unit.add("Cm");
		unit.add("M");
		unit.add("Inch");
		unit.add("Feet");
		unit.add("Yard");
		unit.add("Mile");
		
		for(int j = 0; j < unit.size(); j++) {
			System.out.printf("%-15s",unit.get(j));
		}

		System.out.println();
		for(int i = 0; i < len.size(); i++) {
			String cm = String.format("%.12f", len.get(i));
			String m = String.format("%.12f", len.get(i)/100);
			String inch = String.format("%.12f",len.get(i)/2.54);
			String feet = String.format("%.12f",len.get(i)/30.48);
			String yard = String.format("%.12f",len.get(i)/91.44);
			String mile = String.format("%.12f",len.get(i)/160934.4);
			System.out.printf("%4s",unit.get(i+1));
			System.out.printf(" "+cm+" "+m+" "+inch+" "
					+feet+" "+yard+" "+mile+"\n");
		}
		
	}
}
