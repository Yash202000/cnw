public class Composite {
    static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        
        return true;
    }
    public static void print_composite(int n)
    {
        // write your code logic here 
        for(int i=2;i<=n;i++){
            if(!isPrime(i)) System.out.println(i);
        }
        
    }
}
