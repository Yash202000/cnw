import java.util.*;

public class AlphabetPattern{
	public static void main(String[] args) {
	 	// write your code logic here !!
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){

				System.out.print((char)('A'+i-1));
			}
			System.out.println();
		}

    }
}