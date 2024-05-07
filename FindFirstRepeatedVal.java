import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindFirstRepeatedVal {
    public static void main(String[] args) {
        String str = "java hello world";
        Map.Entry<Character,Long> a = findFirstRepVal(str);
        System.out.println(a);
    }

    private static Map.Entry<Character,Long> findFirstRepVal(String str) {
        Map<Character, Long> res = new LinkedHashMap<>();

        str.chars()
            .mapToObj(x -> (char)x)
            .filter(x -> x != ' ')
            .forEach(x -> res.put((char) x, res.getOrDefault((char) x, 0L)+1L));
         for ( Map.Entry<Character,Long> rr : res.entrySet()) {
             System.out.println(rr.getKey()+" "+rr.getValue());
         }

         Map.Entry<Character,Long> result= res.entrySet().stream()
              .filter(x -> x.getValue() >= 2L)
              .findFirst()
              .get();
             

        return result;
    }
}
