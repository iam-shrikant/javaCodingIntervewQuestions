package practiseQuestions;

public class ReverseNumber {

	public static int reverseNumber(int num) {
		int reversedNum = 0;
		int reminder = 0;
		while(num > 0) {
			reminder = num % 10;
			num = num / 10;
			reversedNum = reversedNum * 10 + reminder;
		}
		return reversedNum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseNumber(1234));
	}
}
