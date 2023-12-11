public class HighestOccuringCharacter {
    public static char highestOccuringChar(String str) {
		final int ASCII_SIZE = 256;

		int count[] = new int[ASCII_SIZE];
 
        
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        int max = -1; // Initialize max count
        char result = ' '; // Initialize result
 
       
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
 
        return result;
	}
}
