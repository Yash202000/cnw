
public class IntersectionOfTwoArraysII {

    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
       // iterate over first array with ref to 2nd if found then mark it as -inf and then contine the search.

       int i=0;

       while(i<arr1.length){
           int j=0;
           boolean found = false;

            while(j<arr2.length && found==false){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j] = Integer.MIN_VALUE;
                    found = true;
                }
                j++;
            }
            i++; 
       }

    }
    
}
