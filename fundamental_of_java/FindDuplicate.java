import java.util.HashMap;

public class FindDuplicate {
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        HashMap<Integer,Integer> map = new HashMap<>(arr.length);
       
       for(int num : arr){
            Integer occurrence = map.get(num);
        
            // if occurrence is null, set it to 1, 
            // else increment the occurrence
            map.put(num, occurrence==null ? 1 : occurrence+1);
        }
        // traversing entryset to find the key with occurrence == 1
        for( HashMap.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() != 1)
            {
                return e.getKey();
            }
        }

        return 0;


    }
}
