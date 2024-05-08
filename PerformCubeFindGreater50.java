import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PerformCubeFindGreater50 {
    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(1,2,3,4,5);

        Map<Integer, Integer> res = Find(source);
    }

    private static Map<Integer, Integer> Find(List<Integer> source) {
        Map<Integer, Integer> v1 = new LinkedHashMap<>();

           source.stream()
                 .forEach(x-> v1.put(x, (x*x*x)));
                 System.out.println("after converting list into map with actual list value as map key and cube value as map value:");
                 for (Map.Entry<Integer, Integer> res : v1.entrySet()) {
                    System.out.println(res.getKey()+" "+ res.getValue());
                 }
                 Map<Integer, Integer> v2 = new LinkedHashMap<>();
            v1.entrySet().stream()
                          .filter(x -> x.getValue()>= 50)
                          .forEach(x-> v2.put(x.getKey(), x.getValue()));
              System.out.println("after finding the cube value greater than or equalto 50:");

              for (Map.Entry<Integer, Integer> result: v2.entrySet()) {
                System.out.println(result.getKey()+" "+result.getValue());
              }
        return v2;
    }
}
