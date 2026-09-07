package array70;

public class Reverse {
	public static void reverse(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		reverse(arr);
	}

}
