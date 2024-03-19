package practiseQuestions;

public class SwapTwoNumbers {
	
	public static void swapNumbers(int a, int b) {
		a = a + b; // 5+10 = 15
		b = a - b; // 15-10 = 5
		a = a - b; // 15 - 5 = 10
		
		System.out.println("Values  after swap : a ="+a+" b = "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapNumbers(5,10);
	}

}
