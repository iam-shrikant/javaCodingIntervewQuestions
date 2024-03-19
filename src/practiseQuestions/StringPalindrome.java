package practiseQuestions;

public class StringPalindrome {
	
	public static boolean isStringPalindrome(String str) {
		int start =0;
		int end = str.length()-1;
		while(end > start) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isStringPalindrome("ABCCBA")) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}
}
