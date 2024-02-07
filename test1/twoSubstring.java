package test1;

// You are given a string S. Your task is to determine if the given string S contains two non-overlapping substrings "AB" and "BA" (the substrings can go in any order). Print "YES" or "NO".
// The string S contains uppercase Latin letters only.
// Input format :
// Line 1: String S
// Output format :
// YES or NO
// Constraints :
// 1 <= n (Length of String s) <= 10^5
// Sample Input 1 :
// ABA
// Sample Output 1 :
// NO
// Sample Input 2 :
// BACFAB
// Sample Output 2 :
// YES
// Sample Input 3 :
// AXBYBXA
// Sample Output 3 :
// NO

public class twoSubstring {
    public static void twoSubstrings(String s) {
        
        
        String result = containsSubstrings(s) ? "YES" : "NO";

        // Output the result
        System.out.println(result);

    }

    private static boolean containsSubstrings(String s) {
        return checkSubstrings(s, "AB", "BA") || checkSubstrings(s, "BA", "AB");
    }

    private static boolean checkSubstrings(String s, String substring1, String substring2) {
        int index1 = s.indexOf(substring1);
        int index2 = s.indexOf(substring2, index1 + 2);

        return index1 != -1 && index2 != -1;
    }
}
