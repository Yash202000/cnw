    public class PrintSpiral {

        public static void spiralPrint(int matrix[][]) {
            if (matrix.length > 0 && matrix[0].length > 0){
    
                int row = matrix.length;
                int column = matrix[0].length;
    
                
    
            int left = 0, right = column - 1;
            int top = 0, bottom = row - 1;
    
            while (left <= right && top <= bottom) {
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
    
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
    
                if (top <= bottom) { // Check to avoid duplicate printing in case of odd rows
                    for (int i = right; i >= left; i--) {
                        System.out.print(matrix[bottom][i] + " ");
                    }
                    bottom--;
                }
    
                if (left <= right) { // Check to avoid duplicate printing in case of odd columns
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(matrix[i][left] + " ");
                    }
                    left++;
                }
            }
    
    
            }
            
        }
    }
