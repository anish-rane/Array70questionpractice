package array70;

import java.util.Arrays;

public class MinOFArray {
	public static void MinArray(int[] arr) {
		int min= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	public static void MaxArray(int[] arr) {
		int max= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		MinArray(arr);
		MaxArray(arr);
		Arrays.sort(arr);
		System.out.println("Min:"+arr[0]+" Max: "+arr[arr.length-1]);
	}
}
