import java.util.*;

public class InvertedNumberPattern {
    public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=num;i>0;i--){
			for(int j=i;j>0;j--){
				System.out.print(i);
			}
			System.out.println();
		}

		
	}
}
