public class Permutation {
    static int factorial(int n){
        int ans=1;
        for(int i=2;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
    

    public static int permutation(int n, int r) {
        return Math.round(factorial(n)/factorial(n-r));
    }
}
