import java.util.*;

public class SumOrProduct {

	static void computeSum(int num){
		int sum = 0;
		for(int i=1;i<=num; i++){
			sum+=i;
		}
		System.out.println(sum);
	}


	static void computeProduct(int num ){
		double product = 1;
		for(int i=1;i<=num;i++){
			product*=i;
		}
		System.out.println((int)product);
	}
	
	public static void main(String[] args) {
		// Write your code here

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int choice = sc.nextInt();

		switch(choice){
			case 1:
				computeSum(num);
				break;
			case 2:
				computeProduct(num);
				break;
			default:
				System.out.println(-1);
		}

	}
}
 