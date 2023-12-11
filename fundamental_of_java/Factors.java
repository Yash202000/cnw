import java.util.*;


public class Factors {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean flag = true;

        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.print(i+" ");
                flag = false;
            }
        }
        if(flag==true){
            System.out.println(-1);
        }

        sc.close();

    }
}
