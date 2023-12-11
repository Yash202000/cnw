public class ArrangeNumberInArray {
    
    public static void arrange(int[] arr, int n) {
    	int left = 0, right=n-1,num=1;
        while(left<=right){
            if(num%2!=0){
                arr[left] = num;
                num++;
                left++;
            }
            else{
                arr[right] = num;
                num++;
                right--;
            }
        }

    }
}
