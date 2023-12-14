public class PairSumTwo {
    public static int pairSum(int[] arr, int num) {
		int count=0;
		for(int i=0;i<arr.length-1;i++){

			for(int j=i+1;j<arr.length;j++){
				if(i!=j && arr[i]+arr[j]==num) count++;
			}
		}

		return count;


	}
}
