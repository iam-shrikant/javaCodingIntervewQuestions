package practiseQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {
	
	public static void usingSet(String str) {
		char[] charArr = str.toCharArray();
		Set<Character> s = new HashSet<Character>();
		
		for(char c : charArr) {
			s.add(c);
		}
		System.out.println(s);
	}
	
	public static void usingOtherWay(String str) {
		char[] charArr = str.toCharArray();
		
	}
	
	public static void main(String[] args) {
		usingSet("abcdaashbc");
	}
}
