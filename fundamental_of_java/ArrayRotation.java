public class ArrayRotation {
    
    static int[] simpleArrayRotation(int a[], int x, String dir) {
        int len = a.length;
        int ans[] = new int[len];

        int steps = 0;
        if (x > len) {
            steps = x % len;
        } else {
            steps = x;
        }

        if ("LEFT".equals(dir)) {
            for (int i = 0; i < a.length; i++) {
                ans[(i - steps + len) % len] = a[i];
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                ans[(i + steps) % len] = a[i];
            }
        }

        return ans;
    }

    static void ReverseArray(int a[],int l,int r){
        while(l<r){
            int temp = a[l];
            a[l] = a[r];
            a[r] =temp;
        }
    }
    static void dynamicArrayRotation(int a[],int x, String dir){


    }
 

    public static int[] rotateArray(int []a, int x, String dir) {
        
        return simpleArrayRotation(a, x, dir);


    }
    
}