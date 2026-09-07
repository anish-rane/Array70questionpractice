package array70;

public class MostfreqElement {
public static void mostfindFrequency(int[] arr){
		int max=Integer.MIN_VALUE;
		int ele=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=Integer.MIN_VALUE) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j]=Integer.MIN_VALUE;
					}
				}
//				System.out.println(arr[i]+":"+count);
				if(count>max) {
					max=count;
					ele=arr[i];
				}
			}
			
		}
		System.out.println("Most freq. element is: "+ele);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,10,20,10,30};
		mostfindFrequency(arr);
	}

}
