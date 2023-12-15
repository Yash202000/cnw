public class RemoveDuplicatesRecursively {
    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() < 2) {
            return s;
        }

        String smallString = removeConsecutiveDuplicates(s.substring(1));
       
        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + smallString.substring(1);
        }

        return s.charAt(0) + smallString;
    }

}
