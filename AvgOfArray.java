package array70;

public class AvgOfArray {
	public static void avg(int[] arr) {
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("Avg: "+sum/n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		avg(arr);

	}

}
