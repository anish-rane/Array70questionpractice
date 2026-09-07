package array70;

import java.util.Arrays;

public class Digisum {
	public static void digisum(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			int n=arr[i];
			while(n!=0) {
				int rem=n%10;
				sum+=rem;
				n/=10;
			}
			arr[i]=sum;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[]arr= {123,71,66,65,74};
		digisum(arr);
	}
}
