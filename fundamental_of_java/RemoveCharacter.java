public class RemoveCharacter {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String ans ="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=ch){
				ans+=str.charAt(i);
			}
		}
		return ans;
	}
}
