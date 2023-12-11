public class SquareMatrix{
    public static String sqrMat(int [][]mat, int n, int m,int diag[]) 
    {
            // Write your code here.
            if(n==m){
                for(int i=0;i<n;i++){
                    diag[i] = mat[i][i];
                }
                return "YES";
            }
            else{
                return "NO";
            }
        }
}