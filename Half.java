package array70;

public class Half {
	public static void half(int[] arr) {
		int sum1=0;
		int suml=0;
		int max1=arr[0];
		int maxl=arr[0];
		int min1=arr[0];
		int minl=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(i<=arr.length/2) {
				sum1+=arr[i];
				if(arr[i]<min1) {
					min1=arr[i];
				}
				if(arr[i]>max1) {
					max1=arr[i];
				}
			}else {
				suml+=arr[i];
				if(arr[i]<minl) {
					minl=arr[i];
				}
				if(arr[i]>maxl) {
					maxl=arr[i];
				}
			}
		}
		System.out.println("sum of 1st half:"+sum1);
		System.out.println("min of 1st half:"+min1);
		System.out.println("max of 1st half:"+max1);
		System.out.println("avg of 1st half:"+sum1/(arr.length/2));
		System.out.println("sum of 2st half:"+suml);
		System.out.println("min of 2st half:"+minl);
		System.out.println("max of 2st half:"+maxl);
		System.out.println("avg of 2st half:"+suml/(arr.length/2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		half(arr);
	}

}
