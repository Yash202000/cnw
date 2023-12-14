public class ArrayIntersection {
    public static void sort(int[] arr, int left, int right){
		if(left<right){
			// take mid of the array
			int mid = (left + right)/2;

			// sort left part and right part
			sort(arr, left,mid);
			sort(arr,mid+1,right);

			// merge the leftpart and right part
			merge(arr,left,mid, right);
		}
	}


	public static void merge(int[] arr, int l, int m , int r){
		// first find size of arrays to merge..
		int n1 = m - l + 1;
		int n2 = r - m;

		// create left array and right array
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		// copy data to temp array
		for(int i=0;i<n1;i++){
			leftArray[i] = arr[l+i];
		}

		for(int j=0;j<n2;j++){
			rightArray[j] = arr[m+j+1];
		}


		// Merge the temp array 
		int i=0, j=0;
		int k = l;

		while(i<n1 && j<n2){
			if(leftArray[i] <= rightArray[j]){
				arr[k] = leftArray[i];
				i++;
			}else{
				arr[k] = rightArray[j];
				j++;
			}

			k++;
		}

		// copy remaining element of leftarray 
		while (i < n1) { 
            arr[k] = leftArray[i]; 
            i++; 
            k++; 
        } 
  
        // Copy remaining elements of R[] if any 
        while (j < n2) { 
            arr[k] = rightArray[j]; 
            j++; 
            k++; 
        } 

	}

	public static void intersection(int[] arr1, int[] arr2) {

		sort(arr1, 0, arr1.length -1);
		sort(arr2, 0, arr2.length -1);

		int i=0, j=0;
		while(i<arr1.length&& j<arr2.length){
			if(arr1[i]==arr2[j]){
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}else if(arr1[i]<arr2[j]){
				i++;
			}else{
				j++;
			}
			
		}

	}
}
