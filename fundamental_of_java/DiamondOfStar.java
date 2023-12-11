import java.util.*;

public class DiamondOfStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<=num/2;i++){
            //print spaces;
            int j=num/2 -i;
            while(j>0){
                System.out.print(" ");
                j--;
            }

             j=0;
            while(j<2*i+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }


         for(int i=num/2-1;i>=0;i--){ //3 2 1 0

            //print spaces;
            int j=num/2-i;
            while(j>0){
                System.out.print(" ");
                j--;
            }

            j=0;
            while(j<2*i+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }

        sc.close();

    }
}
