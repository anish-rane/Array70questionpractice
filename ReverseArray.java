package array70;

import java.util.Arrays;

public class ReverseArray {
	public static void reverseArray(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void reverse(int[] arr) {
		int i=0;
		int n=arr.length;
		int j=n-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		reverse(arr);
		
	}
}
