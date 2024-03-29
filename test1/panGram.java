package test1;
import java.util.HashSet;
import java.util.Set;


// Pangram
// A word or a sentence is called a pangram if all the characters of this language appear in it at least once. You are given a string s consisting of lowercase and uppercase Latin letters. Check whether this string is a pangram. Print "YES" or "NO".
// We say that the string contains a letter of the Latin alphabet, if this letter occurs in the string in either uppercase or in lowercase.
// Input format :
// Line 1 : n (Number of characters in string)
// Line 2 : Input string s
// Output format :
// YES or NO
// Constraints :
// 1 <= n <= 100
// Sample Input 1 :
// 12
// toosmallword
// Sample Output 1 :
// NO
// Sample Input 2 :
// 35
// TheQuickBrownFoxJumpsOverTheLazyDog
// Sample Output 2 :
// YES
public class panGram {

    public static void ans(int n, String str) {
		String result = isPangram(str) ? "YES" : "NO";
		System.out.println(result);
	}

	private static boolean isPangram(String str){
		Set<Character> set = new HashSet<>();

		for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(Character.toLowerCase(c));
            }
        }

        return set.size() == 26;
		
	}

    
}
