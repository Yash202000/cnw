public class PrintLikeWave {
    public static void wavePrint(int mat[][]) {
        // Your code goes here
        int topPointer = 0, bottomPointer = 0;

        if (mat.length > 0 && mat[0].length > 0) {

            int row = mat.length, column = mat[0].length;

            while (bottomPointer < column && topPointer < column) {
                if (bottomPointer < column && topPointer < column) {
                    for (int current = 0; current < row; current++) {
                        System.out.print(mat[current][topPointer] + " ");
                    }
                    topPointer++;
                    bottomPointer++;

                }

                if (bottomPointer < column && topPointer < column) {
                    for (int current = row - 1; current >= 0; current--) {
                        System.out.print(mat[current][bottomPointer] + " ");
                    }
                    topPointer++;
                    bottomPointer++;

                }

            }

        }

    }
}
