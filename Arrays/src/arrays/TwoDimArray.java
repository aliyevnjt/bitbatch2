package arrays;

import java.util.Arrays;

public class TwoDimArray {
	public static void main(String[] args) {
//		int [] [] arr = new int [2] [3];
//		arr [0][0] = 1;
//		arr [0][1] = 2;
//		arr [0][2] = 3;
//		arr [1][0] = 15;
//		arr [1][1] = 8;
//		arr [1][2] = 12;//arr[0]  arr[1]
		int [] [] arr = {{1,2,3},{15,8,12,13,12},{2,4}};
//		System.out.println(Arrays.deepToString(arr));
//		System.out.println(arr[1].length);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		//		for(int i = 0; i < 2; i++ ) {
//			for(int j = 0; j < 3; j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
		
	}
}
