import java.util.Arrays;

public class SortAnArrayConvertToStream {
    public static void main(String[] args) {
        int[] a = {1,4,3,5,2};
        // Arrays.sort(a);
      //ASE ORDER
        Arrays.stream(a)
        .sorted()
        .forEach(x->{System.out.println(x);});
      System.out.println("-------------------------------------");
      //DSE ORDER
      Integer[] res=  Arrays.stream(a)
           .mapToObj(x -> x)
           .sorted((x1,y1) -> y1.compareTo(x1))
           .toArray(Integer[]::new);

           for (Integer integer : res) {
            System.out.println(integer);
           }
    }
}
