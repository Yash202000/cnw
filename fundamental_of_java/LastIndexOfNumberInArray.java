public class LastIndexOfNumberInArray {
    public static int lastIndexHelper(int[] arr, int x, int i ){
		if(i<0) return -1;
		if(arr[i]==x) return i;

		return lastIndexHelper(arr,x,i-1);
	}

	public static int lastIndex(int input[], int x) {
		
		return lastIndexHelper(input,x,input.length-1);

	}
}
