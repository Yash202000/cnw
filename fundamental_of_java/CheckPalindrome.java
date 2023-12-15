public class CheckPalindrome {
    public static boolean isPalindromeHelper(String str, int i, int j){
        if(i>j) return true;
        if(str.charAt(i)!=str.charAt(j)) return false;

        return isPalindromeHelper(str,i+1,j-1);


    }
    
    public static boolean isPalindrome(String str) {
        
        return isPalindromeHelper(str,0,str.length()-1);


    }
}
