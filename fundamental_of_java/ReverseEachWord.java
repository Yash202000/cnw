public class ReverseEachWord {
    static String ReverseString(String str,int start,int end){
		String ans= "";
		for(int i=start;i<=end;i++){
			ans = str.charAt(i)+ans;
		}
		return ans;
	}

	public static String reverseEachWord(String str) {
		//Your code goes here
		String ans="";
		int start=0,end=0;

		for(int i=0;i<str.length();i++){

			if(str.charAt(i)==' '|| i==str.length()-1){
				if(i==str.length()-1){
					end=i;
				}else{
					end = i-1;
				}
				
				String temp = ReverseString(str,start,end);		
				ans = ans+ temp+" ";
				start = i+1;
			}

		}
		return ans;

	}
}
