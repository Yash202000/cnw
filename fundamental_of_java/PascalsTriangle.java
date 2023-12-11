import java.util.*;

public class PascalsTriangle {
    public static void printPascal(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                // for left spacing
                System.out.print(" ");
            }
            // used to represent C(i, j)
            int C = 1;
            for (int j = 1; j <= i; j++) {
                // The first value in a i is always 1
                System.out.print(C + " ");
                C = C * (i - j) / j;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n  = sc.nextInt();

        printPascal(n);
        sc.close();

    }
}
