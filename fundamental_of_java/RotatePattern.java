import java.util.Scanner;
public class RotatePattern {
	public static void main(String args[]) {
        

        // write your code logic !!
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1;i<=num;i++){
			int p=i;
			for(int j=1;j<=num;j++){
				if(p%num==0){
					System.out.print(num+" ");
				}else{
					System.out.print(p%num+" ");
				}
				p++;
				
			}
			System.out.println();
		}
	}
}