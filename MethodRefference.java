import java.util.Arrays;

public class MethodRefference {
    public static int compareByLength(String s1, String s2){
        return s1.length() - s2.length();
    }
    public static void main(String[] args) {
        String[] names = {"praveen", "ram", "raju", "praveen"};
        Arrays.sort(names, (s1,s2)->MethodRefference.compareByLength(s1, s2));
        System.out.println(Arrays.toString(names));
        
    }
}
