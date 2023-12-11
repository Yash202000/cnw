import java.util.*;
public class ReverseNumber {
	
	public static void main(String[] args) {
		// Write your code here
		int len = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tempNum = num;

        //calculate length of the num
		while(tempNum!=0){
			len+=1;
			tempNum/=10;
		}

        // then use length to create num
		double  ans  = 0;
		while(num!=0){
			int reminder = num%10;
			ans = ans+ reminder * Math.pow(10, len-1);
			len-=1;
			num/=10;
		}

		System.out.println((int)ans);

        sc.close();

	}
}