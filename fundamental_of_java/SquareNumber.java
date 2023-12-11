import java.util.*;
public class SquareNumber
{
	public static void main(String[] args) 
	{
		 // write your code !!  
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				System.out.print(num-j+1);
			}
			System.out.println();
		}
    }
		   
}
