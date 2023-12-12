public class TotalSumOfBoundries {
    public static void totalSum(int[][] mat) {
        if(mat.length>0){
            int sum = 0;
            int N = mat.length;
            
            // top & bottom row
            for(int i=0;i<N;i++){
                sum+=mat[0][i];
                sum+=mat[N-1][i];
            }

            // left & right column
            for(int i=1;i<N-1;i++){
                sum+=mat[i][0];
                sum+=mat[i][N-1];
            }

            // left diagonal and right diagonal
            for(int i=1;i<N-1;i++){
                sum+=mat[i][i];
                sum+=mat[i][N-i-1];
            }

            if(N%2!=0){
                sum-=mat[N/2][N/2];
            }

            System.out.print(sum);


        }
        else{
            System.out.print(0);
        }
        
        System.out.println();
    }
}
