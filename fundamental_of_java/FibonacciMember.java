public class FibonacciMember {
    
	public static boolean checkMember(int n){
			
		if(n==0|| n==1) return true;
		int prev = 0, curr = 1;
		while(curr<=n){
			int next = prev+curr;
			prev = curr;
			curr = next;
			if(curr==n) return true;
		}
		return false;

	}
	
}
