public class CheckNumberInArray {
    public static boolean isSortedHelper(int [] arr, int i){

        if(arr.length-1==i) return true;
        if(arr[i]>arr[i+1]) return false;

        return isSortedHelper(arr,i+1);
    }
    

    public static boolean arraySortedOrNot(int []A, int N) {
       
            return isSortedHelper(A,0);
    }
}
