public class FindUnique {
    /**
     * 
     * @param inputArray
     * @return returns unique Element in the array. 
     *         -1 if no unique element is available in the array.
     */
    
    public static int findUnique(int[] arr){
        int result = 0;
        for(int i=0;i<arr.length;i++)
        {
            result ^= arr[i];
        }
                        
        return (result>0 ? result : -1);
      }
    
}
