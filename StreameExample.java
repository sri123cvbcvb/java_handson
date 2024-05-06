import java.util.Arrays;
import java.util.List;

public class StreameExample {
    
    /* -> set interface ia an one of the part of the collection framework. it represents a generally 
    unordered with collection of unique values. it will not allow dupicate values in the collection. 
    the commonly used implementation of the set interface are hashset, treeset, linkedhashset.

    hashset:
         -> most popular set
         -> the widely used implementation of the set interface based on the hash table
         -> the hash table stores data in key - value pair so it provides fast in operations.
         -> it provides constant time performance for basic oprations like adding, remove, 
         contains(checking whether the values present in the set interface or not) 
         -> constant time com
     */

     public static void main(String[] args) {
        //find the sum of even number in given list:
        List<Integer> name = Arrays.asList(2,3,4,5);
         int even = name.stream().filter(n -> n%2==0).reduce(0,(res,i)-> res+i);
         System.out.println(even);
         //find the even number in given list:
         List<Integer> even1 = name.stream().filter(n -> n%2 ==0).toList();
         even1.forEach(System.out::println);
     }

}
