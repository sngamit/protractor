package myPackage;

public class LargestValueInArray {

	public static void main(String[] args) {
		
		int[] arr= {10,12,18,5,7};
		int val=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> val) {
				val=arr[i];
				
			}
		}
		
		System.out.println("Largest value in array is "+val);
		
	}

}
