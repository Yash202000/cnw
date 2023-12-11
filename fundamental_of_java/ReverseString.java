import java.util.*;

public class ReverseString{
    public static String stringReverse(char[] arr) {
        // Write your code here.
        String ans = "";
        for(int i=0;i<arr.length;i++){
          ans = arr[i]+ans;
        }
        return ans;
    
      }
}