package arrays;

public class BruteForceMaximumValueInArr {
	
	public static void main(String [] args) {
		
		
		int [] arr= {1,3,18,28,5,9};
		
		System.out.println(maxValue(arr));
	}

	
	static int  maxValue(int [] arr) {
		
		int maxval=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i] > maxval) {
				
				maxval=arr[i];
				
			}
		}
		
		return maxval;
	}
}
