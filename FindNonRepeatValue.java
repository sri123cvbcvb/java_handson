import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNonRepeatValue {
    public static void main(String[] args) {
        String S = "ababcabab";
        
        char firstNonRepeating = findFirstNonRepeating(S);
        
        System.out.println("First non-repeating character: " + firstNonRepeating);
    }
    
    public static char findFirstNonRepeating(String S) {
        // Create a map to store character frequencies while preserving insertion order
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        
        // Count frequency of characters in the string
        S.chars().forEach(c -> frequencyMap.put((char) c, frequencyMap.getOrDefault((char) c, 0)+1)) ;

        List<Character> nonRepeatingCharacters = frequencyMap.entrySet().stream()
                
                .filter(entry -> entry.getValue() >=3)
                .peek(entry -> System.out.println("Non-repeating character: " + entry.getKey()+" "+ "value:"+ entry.getValue()))
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
                                                             
        // Return the first non-repeating character if found, else return '\0'
        return nonRepeatingCharacters.isEmpty()? 'n': nonRepeatingCharacters.get(0);
       
    }
}
