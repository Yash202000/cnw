import java.util.*;

public class FarenheitToCensius {
    public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int sf = sc.nextInt();
		int ef = sc.nextInt();
		int step = sc.nextInt();

		for(int i=sf;i<=ef;i+=step){
			System.out.print(i+" "+Math.round((i-32)*5/9)+'\n');
		}

        sc.close();

		
	}
    
}
