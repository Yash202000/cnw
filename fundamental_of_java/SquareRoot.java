import java.util.*;

public class SquareRoot {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		double  num  = sc.nextDouble();

		boolean flag = true;
		double i=0;
		while(flag==true){
			double tempNum = Math.pow(i, 2);
			if(tempNum>num){
				flag = false;
				System.out.println((int)i-1);
			}
			i++;


		}
        sc.close();



	}
}

