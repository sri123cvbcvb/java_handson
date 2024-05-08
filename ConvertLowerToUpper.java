import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertLowerToUpper {
    public static void main(String[] args) {
        List<String> source = Arrays.asList("sri", "ram", "raj");
        
          List<String> res=  source.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
                
                System.out.println(res);
                for (String string : res) {
                    System.out.println(string);
                }
    }
}
