import java.util.stream.IntStream;

import javax.print.DocFlavor.STRING;

public class Palindrom{
    public static void main(String[] args) {
        String word = "rah";
        boolean isPalindrome = isPalindrome(word);
        System.out.println("Is '" + word + "' a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        // Convert the string to a stream of characters
        IntStream chars = str.chars();
        chars.forEach(c -> {System.out.println((char)c);});
        //  Reverse the stream of characters and convert it back to a string
         StringBuffer reversed = chars.mapToObj(c -> (char) c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append);
         StringBuffer rev = reversed.reverse();
         System.out.println(reversed);
                            // .reduce("", (s, c) -> c + s, String::concat);

        // Compare the original string with the reversed string
         return str.equals(reversed);
        // return false;
    }
}
