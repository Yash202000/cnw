import java.util.*;

public class InterestingAlphaTriangle {
    public static void main(String[] args) {
		//Your code goes here
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1;i<=num;i++){
			for(int j=i;j>0;j--){	
				System.out.print((char)('A'+num-j));
			}
			System.out.println();
		}

	}
    
}
