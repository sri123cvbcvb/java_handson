import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindNonRepeatFirstVal {
    public static void main(String[] args) {
        String str = "java hello world";
        char a= FindFistNonRepeatVal(str);
        System.out.println(a);
    }

    private static char FindFistNonRepeatVal(String str) {
        Map<Character, Long> res = new LinkedHashMap<Character, Long>();
        str.chars()
            .mapToObj(x -> Character.toLowerCase(Character.valueOf((char) x)))
            .filter(x-> x != ' ')
            .forEach(c -> res.put(c, res.getOrDefault(c, 0L)+1L));
            

            for (Map.Entry<Character, Long> rr: res.entrySet()) {
                System.out.println(rr.getKey()+" "+rr.getValue());
            }
           List<Character> fno= res.entrySet().stream()
               .filter(x -> x.getValue() == 1L)
               .map(x->x.getKey())
               .toList();
        return fno.get(fno.size()-1);
    }
}
