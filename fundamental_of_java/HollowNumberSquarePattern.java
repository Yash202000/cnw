import java.util.*;
public class HollowNumberSquarePattern {
    public static void main(String[] args) 
    {
      // write your code here !!
      Scanner sc= new Scanner(System.in);
      int num = sc.nextInt();

      for(int i=1;i<=num;i++){
        for(int j=1;j<=num;j++){
          if(i==1|| i==num){
            System.out.print(j);
          }else{
            if(j==1){
              System.out.print(1);
            }else if(j==num){
              System.out.print(2);
            }else{
              System.out.print(" ");
            }
          }
        }
        System.out.println();
      }
    }
}
