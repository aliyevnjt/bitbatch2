package arrays;

import java.util.Arrays;

public class TwoDimArrayDay2 {
	public static void main(String[] args) {
//		int arr [] [] = new int [2][4];
//		arr[0][0] = 1;
		int arr [][] = {{1,2,3,4},{5,6,7,8}};
//		System.out.println(arr[0][4]);
		System.out.println(Arrays.deepToString(arr));
		//task 10 mins
		//Print elements in array using nested loop
		// output:
		// 1 2 3 4
		// 5 6 7 8
		
		int n = 1024;
        int log = 0;
        for (int i = 1; i < n; i = i * 2);
           log++;
        System.out.println(n + " " + log);

		
		
		
		
		
		
		
	}
}
