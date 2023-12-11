import java.util.ArrayList;

public class MoveZerosToEnd {
	public static void pushZerosAtEnd(ArrayList<Integer> arr){
	
		int count = 0; 
		for (int i = 0; i < arr.size(); i++) { 
			if (arr.get(i) == 0) { 
				count++; 
		
				// deleting the element from vector 
				arr.remove(i); 
				i--; 
			} 
		} 
	
		for (int i = 0; i < count; i++){ 
			// inserting the zero into arraylist 
			arr.add(0); 
		} 

	}
}