public class RemoveConsecutiveDuplicate {
    public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		char prev=str.charAt(0);
		String ans = ""+str.charAt(0);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=prev){
				ans+=str.charAt(i);
				prev = str.charAt(i);
			}
		}
		return ans;
	}
}
