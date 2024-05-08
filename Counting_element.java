import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counting_element {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                                .stream()
                                .filter(x -> Collections.frequency(names, x)>0)
                                .peek(x->{System.out.println(x);})
                                .collect(
                                 Collectors.groupingBy(
                                   Function.identity()
                                 , Collectors.counting()
                                 ));

                                 
        System.out.println(namesCount);
  }
}