public class SumOfArray {
    public static int sumHelper(int i,int n,int[] arr){
		if(i==n) return 0;

		return sumHelper(i+1,n,arr)+arr[i];
	}
	public static int sum(int input[]) {
		
		return sumHelper(0, input.length , input);

	}
}
