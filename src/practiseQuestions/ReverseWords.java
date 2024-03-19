package practiseQuestions;

public class ReverseWords {
	
	public static String reverseWord(String actual_string) {
		//String actual_string = word;
		String[] splitedString = actual_string.split(" ");
		String expected_string = "";
		splitedString[0].length();
		
		for(int j = 0; j< splitedString.length; j++) {
			char[] name_chars = splitedString[j].toCharArray();			
			for(int i = name_chars.length-1; i >= 0; i--) {
				expected_string = expected_string + name_chars[i];
			}
			expected_string = expected_string + " ";			
		}		
		return expected_string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWord("Hello Tester"));		
	}
}
