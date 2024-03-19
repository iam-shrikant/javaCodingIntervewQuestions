package practiseQuestions;

public class SecondMinMaxFromArray {
	
	static int maxNumber;
	static int minNumber;
	public static void secondMaxMinNum(int[] intArr) {
		maxNumber = 0;
		minNumber = 0;
		int temp  = intArr[0];
		int tempMinNumber = intArr[0];;
		
		for(int i = 1;i<=intArr.length-1; i++) {
			if(intArr[i] > temp) {
				maxNumber = temp;
				temp = intArr[i];
			}else if( intArr[i] > maxNumber) {
				maxNumber = intArr[i];
			}
			
			if(tempMinNumber > intArr[i]) {
				minNumber = tempMinNumber;
				tempMinNumber = intArr[i];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {10,5,6,3,8,9};
		secondMaxMinNum(numArr);
		System.out.println("Max number "+maxNumber+"min number "+minNumber);
	}

}
