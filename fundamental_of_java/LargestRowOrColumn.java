public class LargestRowOrColumn {
    public static void findLargest(int mat[][]) {
        int idx = -1;
        boolean isRow = true;
        int maxSum = Integer.MIN_VALUE;

        if (mat.length > 0 && mat[0].length > 0) {
            int m = mat.length, n = mat[0].length;

            // row wise traversal;
            for (int i = 0; i < m; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum = sum + mat[i][j];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                    idx = i;
                }
            }

            // column wise traversal
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int i = 0; i < m; i++) {
                    sum += mat[i][j];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                    isRow = false;
                    idx = j;
                }
            }

            String value = isRow ? "row" : "column";
            System.out.println(value + " " + idx + " " + maxSum);

        } else {
            System.out.println("row 0 " + maxSum);
        }
    }   
}
