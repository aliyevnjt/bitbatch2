package arrays;

import java.util.Arrays;

public class ArrayDay3 {
	public static void main(String[] args) {
		//Create an Array of integers with length of 7
		//Then print all elements of an Array in the same line
		//Sort array
		//Print again
		//Search for 11 in the Array
		int [] array = {1,6,3,19,7,8,90,87};
//		System.out.println(Arrays.toString(array));
//		for(int i = 0; i<array.length; i++) {
//			System.out.print(array[i]+ ",");
//			System.out.print(Arrays.toString(array));
//		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		//System.out.println(Arrays.binarySearch(array, 11));
		int [] array1 = new int [array.length];
//		int j = 0;
//		for(int i = array.length-1; i >= 0; i--) {
//			System.out.println(array[i]); 
//			array1[j] = array[i];
//			j++;
//		}
//		System.out.println(Arrays.toString(array1));
		int l = array.length-1;// 6
		int temp = 0;
		for(int i = l; i >= array.length/2; i--) {
			//System.out.println(i);
			//System.out.println(l-i);
			temp = array[i];// temp = 90
			array[i] = array[l-i];//[1, 3, 6, 7, 8, 19, 87, 1]
			array[l-i] = temp;//[90, 3, 6, 7, 8, 19, 87, 1]
		}
		System.out.println(Arrays.toString(array));
		//BREAK UNTIL 10:15 AM
	}
}
