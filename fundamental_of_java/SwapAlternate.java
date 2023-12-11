public class SwapAlternate {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        for(int i=1;i<arr.length;i+=2){
            int first = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = first; 
        }
    }
}