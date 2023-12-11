public class TotalSumOfBoundriesAndDiagonals {
    public static void totalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        // Summing elements of the first row and last column
        for (int i = 0; i < n; i++) {
            sum += mat[0][i];
            sum += mat[n - 1][i];
        }
	
        // Summing elements of the first column and last column (excluding corners)
        for (int i = 1; i < n-1 ; i++) {
            sum += mat[i][0];
            sum += mat[i][n - 1];
        }


        // Summing elements along both diagonals (excluding the central element if n is odd)
        for (int i = 1; i < n - 1; i++) {
            sum += mat[i][i];
            sum += mat[i][n - i - 1];
        }

        // Subtracting the central element if n is odd
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        System.out.print(sum);
    }
}
