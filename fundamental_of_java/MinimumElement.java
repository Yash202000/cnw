public class MinimumElement {

    public static int minimum_element(int[] arr){

        int min_num  = Integer.MAX_VALUE;
        for(int value: arr){
            if(value<min_num){
                min_num = value;
            }
        }
        return min_num;
    }
}
