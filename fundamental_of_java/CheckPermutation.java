import java.util.Arrays;

public class CheckPermutation{
    
	static boolean checkPermutationWithCountMethod(String str1, String str2){
		if(str1.length()!=str2.length()) return false;

		int[] charCount = new int[256];

		for(char c: str1.toCharArray()){
			charCount[c]++;
		}

		for(char c: str2.toCharArray()){
			charCount[c]--;
		}

		for(int count: charCount){
			if(count!=0){
				return false;
			}
		}
		return true;
	}

	static boolean checkPermutationWithArrayMatchMethod(String str1,String str2){
		if (str1.length() != str2.length()) {
            return false;
        }

		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);

	}

	public static boolean isPermutation(String str1, String str2) {
		return checkPermutationWithCountMethod(str1, str2);
	}
}