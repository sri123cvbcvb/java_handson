import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class pattern {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        // Generate pattern elements
        String pattern = IntStream.range(0, rows)
                .mapToObj(row -> IntStream.range(0, columns)
                        .mapToObj(col -> col >= row ? "*" : " ")
                        .collect(Collectors.joining()))
                .collect(Collectors.joining("\n"));

        // Print the pattern
        System.out.println(pattern);
    }
}
