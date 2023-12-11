public class Gcd {
    public static int findGCD(int a, int b) {
        // write the logic 
        int gcd=1;
        for(int i = 1; i <= a && i <= b; i++)   {  
            
            if(a%i==0 && b%i==0)  
            gcd = i;  
        } 
        
        return gcd;
    }
}
