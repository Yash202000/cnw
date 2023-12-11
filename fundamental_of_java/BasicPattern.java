import java.util.*;


public class BasicPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1;i<=num;i++){

			for(int j=1;j<=num;j++){
				System.out.print("#");
			}
			System.out.println();
		}
		 
	}
}