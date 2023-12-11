public class PrefixSum {

    public static void prefixSum(int[] arr) {
        
        int prevSum = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i]+prevSum;
            prevSum = arr[i];
        }
    }

}
