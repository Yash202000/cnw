
public class SumOfTwoArrays {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        
        int i=arr1.length-1, j=arr2.length-1, k = output.length-1;
        int carry = 0;

       
        while(i>=0 && j>=0){
            int total = arr1[i]+arr2[j]+carry;
            output[k] = total%10;
            carry = total/10;
            i--;
            j--;
            k--;
        }

        while(i>=0){
            int total = arr1[i]+carry;
            output[k] = total%10;
            carry = total/10;
            i--;
            k--;

        }

        while(j>=0){
             int total = arr2[j]+carry;
            output[k] = total%10;
            carry = total/10;
            j--;
            k--;
        }

        if(carry>0){
            output[k]=carry;
            
        }

    }

}