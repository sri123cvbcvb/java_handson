import java.util.Arrays;

public class commonPrefix {
    public static void main(String[] args) {
        int N = 5;
        String[] arr = {"geeksforgeeks", "geeks", "geek", "ge","gees","geeksa"};
        System.out.println(arr[1]);
        String prefix = findLongestCommonPrefix(arr);
        
        System.out.println("Longest Common Prefix: " + prefix);
    }
    
    public static String findLongestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }
        
         int minLength = Arrays.stream(arr)
                               .mapToInt(s -> s.length())
                              .min()
                              .orElse(0);
        System.out.println("hai:"+minLength);
        StringBuilder prefixBuilder = new StringBuilder();
        int i = 0;
        for (i = 0; i < minLength; i++) {
            final int index = i;
            char currentChar = arr[0].charAt(i);
            boolean isCommon = Arrays.stream(arr)
                                     .allMatch(str -> str.charAt(index) == currentChar);
            
            if (isCommon) {
                prefixBuilder.append(currentChar);
            } else {
                break;
            }
        }
        
        return prefixBuilder.toString();
    }
}
