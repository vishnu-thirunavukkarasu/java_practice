package arrays;

import java.util.Arrays;

public class Swappingarray {

	
	
	public static void main(String [] args) {
		
		int [] arr= {1,3,5,7,9,11};
		
		swap(arr, 3, 5 );
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int index3, int index5) {
		int temp= arr[index3];
		arr[index3]=arr[index5];
	    arr[index5]=temp;
	}
}
