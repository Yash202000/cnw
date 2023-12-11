public class RowWiseTraversal{
    public static int[] printRowWise(int [][]a) {
        int[] ans = new int[a.length * a[0].length];
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                ans[count] = a[i][j];
                count++;
            }
        }
        return ans; 
    }
}