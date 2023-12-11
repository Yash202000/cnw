public class CompressTheString {
    public static String getCompressedString(String str) {
        if (str == null || str.length() == 0) {
            return str; // Return the original string for empty or null input
        }
        
        char[] charArray = str.toCharArray();

        char current = charArray[0];
        int count = 1;

        String ans = "";

        for (int i = 1; i < charArray.length; i++) {
            if (current == charArray[i]) {
                count++;
            } else {
                if (count == 1) {
                    ans += current;
                } else {
                    ans += current + "" + count;
                }

                current = charArray[i];
                count = 1;
            }
        }

        // Process the last character
        if (count == 1) {
            ans += current;
        } else {
            ans += current + "" + count;
        }

        return ans;
    }

    
}
