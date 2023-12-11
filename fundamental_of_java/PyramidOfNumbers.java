import java.util.*;
public class PyramidOfNumbers
{  
    public static void main(String ar[])  
    {  
     // write your code logic here !!!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            // print spaces 
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }

            System.out.print(" ");

            // print numbers 
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
             System.out.println();
        }

    }  
}