import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        String a = "i.like.this.program.very.much";
        String[] b= a.split("\\.");
        for (String string : b) {
            System.out.println(string);
        }
        List<String> arr = Arrays.asList(b);
         Collections.reverse(arr);
         String output = Arrays.stream(b).collect(Collectors.joining("."));
         System.out.println(output);
    }
}
