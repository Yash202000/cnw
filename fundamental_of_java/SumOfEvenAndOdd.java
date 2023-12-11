import java.util.*;

public class SumOfEvenAndOdd {
    public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
	
		double evenSum =  0;
		double oddSum = 0;

		while(num>0){
			int digit = (int) num%10;
			if(digit%2==0){
				evenSum+=digit;
			}else{
				oddSum+=digit;
			}
			num = num/10;
		}
		System.out.print(Math.round(evenSum)+ " "+Math.round(oddSum));



	}
}
