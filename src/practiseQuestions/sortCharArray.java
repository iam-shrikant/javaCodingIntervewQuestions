package practiseQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class sortCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[] charArr = {'A','G', 'B', 'S', 'O', 'D'}; // A B D G O S
		char[] sortedArr = new char[charArr.length];
		
		for(int i = 0; i<= charArr.length-1; i++){
			int tempPos = 0;
			for(int j = 0; j<= charArr.length-1;j++){			
				if(charArr[i] > charArr[j]){
					tempPos++;
				}
			}
			sortedArr[tempPos] = charArr[i];
		}
		System.out.println(Arrays.toString(sortedArr));
	}
	
}
