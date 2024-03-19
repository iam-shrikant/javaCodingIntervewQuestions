package practiseQuestions;

public class MinMaxNumFromIntArray {
	static int maxNumber;
	static int minNumber;
	public static void MaxMinNum(int[] intArr) {
		maxNumber = intArr[0];
		minNumber = intArr[0];
		
		for(int i = 1;i<=intArr.length-1; i++) {
			 if(intArr[i] > maxNumber) {
				 maxNumber = intArr[i];
			 }
			 
			 if(minNumber > intArr[i]) {
				 minNumber = intArr[i];
			 }
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {5,6,3,8,9};
		MaxMinNum(numArr);
		System.out.println("Max number "+maxNumber+" min number "+minNumber);
	}

}
