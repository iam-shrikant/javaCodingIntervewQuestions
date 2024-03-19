package practiseQuestions;

public class NumberPalindrom {
	public static boolean numberPalindrom(int actualNum) {
		//first reverse the number
		//then compare
		int num = actualNum;
		int reminder = 0;
		int reverseNum = 0;
		while(num>0) {
			reminder = num % 10;
			num = num / 10;
			reverseNum = reverseNum * 10 + reminder;			
		}		
		if(actualNum != reverseNum) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(numberPalindrom(123421)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}

}
