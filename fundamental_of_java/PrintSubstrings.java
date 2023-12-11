public class PrintSubstrings {
    public static void printSubstrings(String str) {
		//Your code goes here
		for(int i=0;i<str.length();i++){
			String ans="";
			for(int j=i;j<str.length();j++){
				ans+=str.charAt(j);
				System.out.println(ans);
			}
		}
	}
}
