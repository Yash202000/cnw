public class FirstIndexOfNumberInArray {
    public static int firstIndexHelper(int[] arr, int x, int i ){
		
		if(i==arr.length) return -1;
		if(arr[i]==x) return i;

		return firstIndexHelper(arr,x,i+1);


	}

	public static int firstIndex(int input[], int x) {
		return firstIndexHelper(input,x ,0);
		
	}
}
