import java.util.Scanner;

public class TransposeOfMatrix {
    


    public static int[][] transpose(int m, int n, int[][] mat) {
		int[][] result = new int[n][m];

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				result[j][i] = mat[i][j];
            }
		}

		return result;
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = sc.nextInt();
        while(chances!=0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] mat = new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    mat[i][j] = sc.nextInt();
                }
            }

            
            int[][] result = transpose(m,n,mat);

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
            chances--;
        }
    }
}
