public class ReturnKeypadString {
    private static String helper(int num){
		if(num==2) return "abc";
		else if(num==3) return "def";
		else if(num==4) return "ghi";
		else if(num==5) return "jkl";
		else if(num==6) return "mno";
		else if(num==7) return "pqrs";
		else if(num==8) return "tuv";
		else if(num==9) return "wxyz";
		else return "";
	}
	
	public static String[] keypad(int n){
		if(n==0|| n==1){
			String[] ans  = {""};
			return ans;
		}

		int newN = n%10;
		String[] ans = keypad(n/10);
		String numString = helper(newN);

		String[] finalAnswer = new String[ans.length*numString.length()];

		int k=0;
		for(int i=0;i<ans.length;i++){
			for(int j=0;j<numString.length();j++){
				finalAnswer[k] = ans[i] + numString.charAt(j);
				k++;
			}
		}

		return finalAnswer;
	}
    
}
