package arrays;

import java.util.Arrays;

public class TwoPointerReverseArray {

	
	
	public static void main(String [] args) {
		
		int[] arr= {1,3,5,7};
		
        reverse(arr);
        System.out.println(Arrays.toString(arr));

		
	}
	
	static void swap(int [] arr, int indexa, int indexb) {
		int temp= arr[indexa];
		arr[indexa]= arr[indexb];
		arr[indexb]= temp;
	}
	
	static void reverse(int [] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			swap(arr, start , end);
			start++;
			end--;
		}
	}
}
