import java.util.*;

public class ReversePyramidStartPattern {
public static void main(String[] args) {
        // write the logic here !!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num;i>0;i--){
            // print spaces
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }

            // print stars
            for(int j=i;j>0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

