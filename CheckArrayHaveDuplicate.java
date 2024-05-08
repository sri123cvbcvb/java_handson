import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckArrayHaveDuplicate {
    public static void main(String[] args) {

         

        int[] source = {1,2,3,4,1};

        boolean val = Find(source);
         System.out.println(val);
        
    }

    private static boolean Find(int[] source) {
        List<Integer> res = Arrays.stream(source)
                                  .boxed()
                                  .collect(Collectors.toList());

            Set<Integer> res2 = new HashSet<>();
            res2.addAll(res);
            for (Integer integer : res2) {
                System.out.println(integer);
            }
            if (res.size() == res2.size()) {
                return false;
            } else {
                return true;
            }
    } 
}
