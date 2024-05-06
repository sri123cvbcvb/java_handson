import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeeksgeek";
        
        // Convert strings to char[] arrays
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        
        // Sort char[] arrays
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        
        // Compare sorted char[] arrays
        boolean isAnagram = Arrays.equals(aChars, bChars);
        
        if (isAnagram) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }
}
