import java.util.Arrays;

public class SecondLargestInArray {
    public static int secondLargestElement(int[] arr, int n) {
    	Arrays.sort(arr);
        return arr[n-2];
    }

}
