import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {
    public static void main(String[] args) {
        List<String> str1 = Arrays.asList("sriram", "ramj");
        List<String> str2 = Arrays.asList("surya", "vijay");
         
        //CONVER TWO LIST INTO STREAM AND THEN CONCAT INTO STREAM:
        Stream<String> concat = Stream.concat(str1.stream(), str2.stream());
        concat.forEach(x -> {System.out.println(x);});


        //CONVER TWO LIST INTO STREAM AND THEN CONCAT INTO STREAM AFTER CONCADINATION CONVERT IT INTO LIST:
        List<String> concat1 = Stream.concat(str1.stream(), str2.stream()).collect(Collectors.toList());
        concat1.forEach(x -> {System.out.println(x);});
    }
}
