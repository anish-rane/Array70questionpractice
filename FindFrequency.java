package array70;

public class FindFrequency {
	public static void findFrequency(int[] arr){
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=Integer.MIN_VALUE) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j]=Integer.MIN_VALUE;
					}
				}
				System.out.println(arr[i]+":"+count);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,10,20,10,30};
		findFrequency(arr);
	}

}
