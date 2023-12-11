import java.util.*;

public class AllPrimeNumber {
	static boolean checkPrime(int num){
		for(int i=2;i<num/2+1;i++){
			if(num%i==0) return false;
		}
		return true;
	};
	

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

	 	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();


		for(int i=2;i<=num;i++){
			boolean flag = checkPrime(i);
			if(flag==true){
				System.out.println(i);
			}

		}


		
	}
}
