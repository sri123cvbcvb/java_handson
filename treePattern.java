import java.util.stream.IntStream;

public class treePattern {
    public static void main(String[] args) {
        int height = 5; // Height of the tree

        // Generating each line of the tree pattern using streams
        IntStream.range(0, height)
                 .mapToObj(i -> " ".repeat(height - i - 1) + "*".repeat(2 * i + 1))
                 .forEach(System.out::println);


                 IntStream.range(0, height)
                 .mapToObj(i -> " ".repeat(height - i - 1) + "*".repeat(2 * i + 1))
                 .forEach(System.out::println);
        // // Printing the base of the tree
        // IntStream.range(0, 4)
        //          .mapToObj(i -> " ".repeat(height - 1) + "*")
        //          .forEach(System.out::println);
    }
}
