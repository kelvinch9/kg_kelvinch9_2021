package solution;

import java.util.HashMap;

public class Main {

	// determine whether a one-to-one character mapping exists from s1 to s2
	public static String mapping (String s1, String s2) {
		
		HashMap<Character, Character> hm = new HashMap<>();
		if(s1 == null && s2 == null) return "true";
		if(s1 == null || s2 == null) return "false";
		if(s1.length() != s2.length()) return "false";
		
		for(int i = 0; i < s1.length(); i++) {
			if(hm.containsKey(s1.charAt(i))) {
				if(hm.get(s1.charAt(i)) != s2.charAt(i)) {
					return "false";
				}
			}
			else {
				if(hm.containsValue(s2.charAt(i))) return "false";
				hm.put(s1.charAt(i), s2.charAt(i));
			}
		}
		return "true";
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
