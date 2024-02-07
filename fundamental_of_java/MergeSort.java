public class MergeSort {
    public static void merge(int[] arr, int left, int mid, int right){
        // first find size of array to merge
        int n1  = mid - left + 1;
        int n2 = right -mid;


        int[] leftArray  = new int[n1];
        int[] rightArray = new int[n2];

        // copy data to temp arrays
        for(int i=0;i<n1;i++){
            leftArray[i] = arr[left+i];
        }

        for(int j=0;j<n2;j++){
            rightArray[j] = arr[mid+j+1];
        }

        // merge above arrays
        int i=0,j=0;
        int k = left;

        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }



    }
    public static void mergeSort(int[] arr, int l, int r){
         if(l<r){
             int mid = (l+r)/2;

             mergeSort(arr, l, mid);
             mergeSort(arr, mid+1, r);
             merge(arr,l,mid,r);
         }

    }
}
