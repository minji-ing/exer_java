package newId;

import java.util.ArrayList;
import java.util.List;

public class NewId {
	public String make(String newId) {
		String answer = "";
		newId = newId.toLowerCase();
		List<String> cutStr = new ArrayList<String>();
		
		for(int i = 0; i < newId.length(); i++) {
			int cut = (int)newId.charAt(i);
			
			if(cut > 96 && cut < 123 || cut > 47 && cut < 58 || cut == 45 || cut == 46 || cut == 95) {
				cutStr.add(Character.toString(newId.charAt(i)));
			} else {
				continue;
			}
		}
		
		if(cutStr.size() > 1) {
			for(int i = 0; i < cutStr.size() - 1; i++) {
				if(cutStr.get(i).equals(".") && cutStr.get(i+1).equals(".")) {
					cutStr.remove(i);
					i--;
				} else {
					continue;
				}
			}
		}

		if(cutStr.get(0).equals(".")) {
			cutStr.remove(0);
		}
		
		if(cutStr.size() > 1 && cutStr.get(cutStr.size()-1).equals(".")) {
			cutStr.remove(cutStr.size()-1);
		}
		
		if(cutStr.size() == 0) {
			for(int i = 0; i < 3; i++) {
				cutStr.add("a");
			}
		} else if(cutStr.size() >= 16) {
			for(int i = 15; i < cutStr.size(); i++) {
				cutStr.remove(i);
				i--;
			}
			if(cutStr.get(cutStr.size()-1).equals(".")) {
				cutStr.remove(cutStr.size()-1);
			}
		} else if(cutStr.size() <= 2) {
			for(int i = cutStr.size(); i < 3; i++) {
				cutStr.add(cutStr.get(cutStr.size()-1));
			}
		}
		
		for(int i = 0; i < cutStr.size(); i++) {
			answer += cutStr.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String newId = "=.=";
		NewId id = new NewId();
		String answer = id.make(newId);
		System.out.println(answer);
	}
}
