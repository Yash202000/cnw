package test1;

// Print Matrix diagonally
// Given a matrix of integers, you need to print it diagonally. Thats is, if input is a 3 x 3 matrix, then order will be -
// (0, 0), (0, 1), (1, 0), (2, 0), (1, 1), (0, 2), (1, 2), (2, 1), (2, 2)
// For eg. if input is -
//  1  2  3
//  4  5  6  
//  7  8  9
// Output : 1 2 4 7 5 3 6 8 9.
// Input format :

// Line 1 : m (No. of rows) and n (No. of columns)

// Next m lines : Each row elements in different line

// Output format : Print elements in specified order, separated by space

// Sample Input :
// 4 4
//  1  2   3  10
//  4  5   6  11
//  7  8   9  12
// 13 14  15  16
// Sample Output :
// 1 2 4 7 5 3 10 6 8 13 14 9 11 12 15 16

public class printMatrixDiagonally {

    public static void printInDiagonalForm(int[][] arr) {
		int rows = arr.length, cols = arr[0].length;

		for (int sum = 0; sum <= rows + cols - 2; sum++) {
            if (sum % 2 == 0) {
                // Print upwards diagonal
                for (int i = Math.min(sum, rows - 1); i >= 0; i--) {
                    int j = sum - i;
                    if (j < cols) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            } else {
                // Print downwards diagonal
                for (int j = Math.min(sum, cols - 1); j >= 0; j--) {
                    int i = sum - j;
                    if (i < rows) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }
	}
    
}
