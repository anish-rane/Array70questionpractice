package array70;

import java.util.Arrays;

public class SumofAllElement {
	public static int sumArray(int[] arr) {
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int sum=sumArray(arr);
		System.out.println("Sum of "+Arrays.toString(arr)+" is: "+sum);
	}
}
