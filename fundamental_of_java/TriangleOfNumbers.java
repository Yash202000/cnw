import java.util.*;

public class TriangleOfNumbers {

    public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=num;i>0;i--){
			int pn = num-i+1;
			// print spaces
			for(int j=i-1;j>0;j--){
				System.out.print(" ");
			}

			//print half pattern
			int lastp = 0;
			for(int j=0;j<pn;j++){
				System.out.print(pn+j);
				lastp=pn+j;
			}

			//print full pattern
			for(int j=1;j<pn;j++){
				System.out.print(lastp-j);
			}
			System.out.println();
		}
	}
}
