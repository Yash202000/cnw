public class MovingAllNegativeNumbers {
    
    static public void swap(int negativePointer, int positivePointer,int a[]){
        int temp = a[negativePointer];
        a[negativePointer] =  a[positivePointer];
        a[positivePointer] = temp;
    }

    public static int[] separateNegativeAndPositive(int a[]) {

        int negativePointer = 0;
        int positivePointer = 0;

        while(negativePointer!=a.length){
            if(a[negativePointer]<0){
                swap(negativePointer,positivePointer,a);
                positivePointer++;
            }
            
            negativePointer++;
        }
        return a;

    }
}
