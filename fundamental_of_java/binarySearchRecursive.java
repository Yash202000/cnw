public class binarySearchRecursive {
    public static int binarySearchHelper(int[] input, int element, int start,int end){
		if(start>end){
			return -1;
		}
		int mid = (start+end)/2;
		if(element==input[mid]) return mid;
		else if(element<input[mid]){
			return binarySearchHelper(input, element, start, mid-1);
		}else{
			return binarySearchHelper(input, element, mid+1, end);
		}
	}

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		
		return binarySearchHelper(input, element, 0,input.length-1);
		


	}
}
