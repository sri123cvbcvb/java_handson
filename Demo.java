import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        String a = "sriram";
        IntStream b= a.chars();
        // b.forEach(System.out::println);
          StringBuffer res= b.mapToObj(val -> String.valueOf((char)val) ).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append);
          StringBuffer res1 = res.reverse();
          System.out.println(res1);
          boolean aa = a.equals(res1);
          System.out.println(aa);
          //    Arrays.stream(res).
        //   for (String string : res) {
        //     System.out.println(string);
        //   }
    }
}
