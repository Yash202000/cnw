import java.util.*;

public class FindPowerOfNumber {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( Math.round(Math.pow(a, b)));


    }
}