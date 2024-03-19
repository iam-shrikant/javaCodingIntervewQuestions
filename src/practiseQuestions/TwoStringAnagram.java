package practiseQuestions;

import java.util.Arrays;

public class TwoStringAnagram {
	
	public static boolean isAnagram(String a, String b) {
		
		char[] firstArr  = a.toLowerCase().toCharArray();
		char[] secondArr = b.toLowerCase().toCharArray();
		
		Arrays.sort(firstArr);
		Arrays.sort(secondArr);
		if(Arrays.equals(firstArr, secondArr)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(isAnagram("Care","Race")) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}

}
