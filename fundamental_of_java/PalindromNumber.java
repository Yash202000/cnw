import java.util.*;

public class PalindromNumber {
    
    static int ReverseNumber(int n){
        int ans=0, len=0, tempN = n;
        while(tempN!=0){
            len++;
            tempN = tempN/10;
        }

        len--;
        while(n!=0){
            int digit = n%10;
            ans = ans + (int )(digit*Math.pow(10, len));
            len--;
            n/=10;
        }
        return ans;
    }

    public static boolean palindromeNumber(int n){
        // Write your code here.
        if(ReverseNumber(n)==n) return true;
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(ReverseNumber(n)==n) System.out.print(true);
        else System.out.print(false);
    
    
    
    }

    
}
