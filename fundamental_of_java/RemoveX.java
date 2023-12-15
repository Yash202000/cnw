public class RemoveX {
    public static String removeX(String input){
		if(input.length()==0) return input;

		String smallString = removeX(input.substring(1));
		if(input.charAt(0)=='x') return smallString;
		return input.charAt(0) + smallString;	

	}
}
