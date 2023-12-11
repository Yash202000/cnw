import java.util.*;

public class TermsOfAp {
	
	public static void main(String[] args) {
		// Write your code here
		//here formula is tn = a + (n-1)*d
		// so comparing the equation d =3 and a = 5;
		Scanner sc = new Scanner(System.in);
		int numOfTerms = sc.nextInt();

		int term=1;
		int a=5, d=3,i=1;
		while(term<=numOfTerms){
			int tempTerm = a+(i-1)*d;
			if(tempTerm%4!=0){
				System.out.print(tempTerm+" ");
				term+=1;
			}

			i+=1;
		}
	}
}