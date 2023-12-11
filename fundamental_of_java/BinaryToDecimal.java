import java.util.*;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);

		double binaryNum = sc.nextDouble();

		double ans = 0;
		int i = 0;
		while(binaryNum!=0){
			int digit =(int) binaryNum%10;
		  	ans+=Math.pow(2,i)*digit;
			binaryNum/=10;
			i++;
		}
        sc.close();
		System.out.println(Math.round(ans));

	}
}
