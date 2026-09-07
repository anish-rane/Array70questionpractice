package array70;

public class EvenSum {
	public static void sumEven(int[] arr) {
		int sumo=0;
		int sume=0;
		int countE=0;
		int countO=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sume+=arr[i];
				countE++;
			}else {
				sumo+=arr[i];
				countO++;
			}
		}
		System.out.println("Even Sum:"+sume);
		System.out.println("Odd sum:"+sumo);
		System.out.println("Even avg:"+sume/countE);
		System.out.println("Odd avg:"+sumo/countO);
	}
	public static void minMaxEO(int[] arr) {
		int minE=arr[0];
		int maxE=arr[0];
		int maxO=arr[0];
		int minO=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				if(arr[i]<minE) {
					minE=arr[i];
				}
				if(arr[i]>maxE) {
					maxE=arr[i];
				}
			}else {
				if(arr[i]<minO) {
					minE=arr[i];
				}
				if(arr[i]>maxO) {
					maxE=arr[i];
				}
			}
		}
		System.out.println("Min odd:"+minO);
		System.out.println("Max odd:"+maxO);
		System.out.println("Min even: "+minE);
		System.out.println("Max Even:"+maxE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		sumEven(arr);
		minMaxEO(arr);

	}

}
