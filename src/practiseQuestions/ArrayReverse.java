package practiseQuestions;

import java.util.Arrays;

public class ArrayReverse {
		
	public static int[] reverseArray(int[] arrNum) {
		int[] reversedArray = new int[arrNum.length];
		int j = 0;
		for(int i = arrNum.length-1; i >=0; i-- ) {
			reversedArray[j] = arrNum[i];
			j++;
		}
		return reversedArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arryNum = {1,6,8,9,6,3};
		System.out.println(Arrays.toString(reverseArray(arryNum)));
	}

}
