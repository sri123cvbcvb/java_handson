import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;
import java.util.function.Function;

public class stream_find_value{
  public static void main(String args[]) {
    String input = "Java articles are Awesome";
    Map<Character, Long> res = new LinkedHashMap<>();
     input.chars()
                   
            .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
            .forEach(c -> res.put((char) c, res.getOrDefault((char) c, 0L)+1L)); 
            // .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
             //Store the chars in map with count
        //   result.entrySet().forEach(x->{System.out.println(x.getKey()+" "+x.getValue());});
        List<Character> a = res.entrySet().stream()
            .filter(entry -> entry.getValue() == 1L)
            .map(entry -> entry.getKey())
            .toList();
    System.out.println(a);  
    System.out.println(a.get(0));                  
    }
}
// e->{System.out.println(e.getKey()+" "+e.getValue());}