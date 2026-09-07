package array70;

public class ReverseLhalf {
	public static void reverseLhalf(int[] arr) {
		for(int i=arr.length-1;i>=arr.length;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		reverseLhalf(arr);
	}

}
