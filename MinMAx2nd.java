package array70;

import java.util.Arrays;

public class MinMAx2nd {
	public static void find(int[] arr) {
		Arrays.sort(arr);
		System.out.println("2nd Min:"+arr[1]);
		System.out.println("2nd max:"+arr[arr.length-2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,8,6,7};
		find(arr);

	}

}
