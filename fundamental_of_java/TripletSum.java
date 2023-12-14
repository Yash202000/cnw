import java.util.Arrays;

public class TripletSum {
    
    public static int findTriplet(int[] arr, int x) {

        int count=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }   
        }
        return count;
    }


    public static int tripletSum(int[] arr, int num) {
		// Your code goes here

		Arrays.sort(arr);
		int n = arr.length;

		int numTriplets = 0;

		for (int i = 0; i < n; i++) {
			int pairSum = num - arr[i];
			int numPairs = 0;

			int start = i + 1;
			int stop = n - 1;

			while (start < stop) {
				if (arr[start] + arr[stop] < pairSum) {
					start++;
				} else if (arr[start] + arr[stop] > pairSum) {
					stop--;
				} else {
					if (arr[start] == arr[stop]) {
						int totalCount = (stop - start) + 1;
						numPairs += (totalCount * (totalCount - 1) / 2);
						break;
					}

					int tempI = start + 1;
					int tempJ = stop - 1;

					while (tempI <= tempJ && arr[start] == arr[tempI]) {
						tempI++;
					}

					while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
						tempJ--;
					}

					int totalElementFromStart = (tempI - start);
					int totalElementFromEnd = stop - tempJ;

					numPairs += (totalElementFromStart * totalElementFromEnd);

					start = tempI;
					stop = tempJ;
				}
			}
			numTriplets += numPairs;
		}
		return numTriplets;
	}

}