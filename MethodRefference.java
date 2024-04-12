import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
//==============METHOD REFFERENCE FOR STATIC METHODS========================
/* 
public class MethodRefference {
    public static int compareByLength(String s1, String s2){
        return s1.length() - s2.length();
    }
    public static String addString (String s3){
        return "hai"+" "+s3;

    }
    public static void main(String[] args) {
        String[] names = {"praveen", "ram", "raju", "praveen"};
        Arrays.sort(names, (s1,s2)->MethodRefference.compareByLength(s1, s2));
        System.out.println(Arrays.toString(names));
       System.out.println("=============using_lambda:==========="); 
        Function<String, String> res = input -> MethodRefference.addString(input);
        String greeting = res.apply("sriram");
        System.out.println(greeting);
        System.out.println("=============using_Method_refference:===========");
        Function<String, String> res1 = MethodRefference::addString;
        String greeting1 = res1.apply("sriram");
        System.out.println(greeting1);
    }
}
*/
//==============METHOD REFFERENCE FOR INSTANCE METHODS========================
/*
public class MethodRefference {
    public int addValues(int a){
        return a*2;
    }
    public String greeting(){
        return "hai";

    }
    public static void main(String[] args) {
        
        MethodRefference mr = new MethodRefference();

        System.out.println("=============using_lambda============");
        Function<Integer, Integer> res = input -> mr.addValues(input);
        int res1 = res.apply(5);
        System.out.println(res1);
        
        System.out.println("=============using_Method_refference============");
        Function<Integer, Integer> res2 = mr::addValues;
        int res3 = res2.apply(6);
        System.out.println(res3);
        
        System.out.println("=============using_lambda============");
        Supplier<String> sp = ()-> mr.greeting();
        String sp1 = sp.get();
        System.out.println(sp1);

        System.out.println("=============using_Method_refference============");
        Supplier<String> sp2 = mr::greeting;
        String sp3 = sp2.get();
        System.out.println(sp3);
    }
}
 */
//=======METHOD REFFERENCE FOR INSTANCE METHODS of an arbitrary object of a particular type:==============
/* 
public class MethodRefference {
         public void mess(String mess){
            System.out.println("how are you"+" "+mess);
         }
    public static void main(String[] args) {
        String[] arr = {"mohan", "hari","surya"};
        String arr2 = "sriram";

        System.out.println("=============using_lambda============");
        Arrays.stream(arr).forEach(input -> new MethodRefference().mess(input));

        System.out.println("=============using_Method_refference============")
        Arrays.stream(arr)
              .forEach(new MethodRefference()::mess);
        
    }
}
*/
//========================================Reference to a constructor:=================================
class OuterMethodRefference {
private String name;

public OuterMethodRefference() {
}

public OuterMethodRefference(String name){
    this.name = name;

}

public String getName() {
    return name;
}
    
}
public class MethodRefference {

    public static void main(String[] args) {
        System.out.println("============Using lambda expression=======================");
        Supplier<OuterMethodRefference> lambda_ref = ()-> new OuterMethodRefference("sriram");
        OuterMethodRefference omrf = lambda_ref.get();
        System.out.println(omrf.getName());

        System.out.println("================Using method reference======================");
        Supplier<OuterMethodRefference> method_ref = OuterMethodRefference::new;
        OuterMethodRefference omrf2 = method_ref.get();
        System.out.println(omrf2.getName());
        
    }
}