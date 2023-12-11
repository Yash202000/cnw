public class ReverseAnArray{
    
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int l=0, r=n-1;
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }
        return nums;

    }
}