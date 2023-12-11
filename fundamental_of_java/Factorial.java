public class Factorial {
	
    static double factHelper(int n){
		if(n==1) return 1;
		return n* factHelper(n-1);
	}
	
	
	public static void fact(int n) {
		System.out.print(Math.round(factHelper(n)));
	}		
}