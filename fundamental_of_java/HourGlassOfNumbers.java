import java.util.*;

public class HourGlassOfNumbers {

    
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// print first half

		//here i will represent the spaces
		for(int i=0;i<num;i++){

			for(int j=0;j<i;j++){
				System.out.print(" ");
			}

			for(int j=i+1;j<=num;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}


		//print second half
		for(int i=1;i<num;i++){

			for(int j=num-i-1;j>0;j--){
				System.out.print(" ");
			}

			for(int j=num-i;j<=num;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}



	}

    
}
