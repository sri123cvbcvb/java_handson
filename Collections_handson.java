import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collections_handson {
    public static void main(String[] args) {
        //List handson:
        List<String> name = new ArrayList<String>();
        name.add("sriram");
        name.add("rajkumar");
        name.add("surya");
        System.out.println(name);
        for (String string : name) {
            System.out.println(string);
        }
        List<String> nam = name.stream().sorted().collect(Collectors.toList());
        System.out.println(nam);
        name.add(0, "ram");
        System.out.println("fetch all data:"+" "+name);
        System.out.println("fetch first:"+" "+name.getFirst());
        System.out.println("fetch last:"+" "+name.getLast());
        System.out.println("fetch class:"+" "+name.getClass());
        System.out.println("fetch the index '0':"+" "+name.get(0));
        System.out.println("change the element at particular index:");
        name.set(0, "rafeek");
        name.set(3, "hari");
        System.out.println("changed elements:"+" "+name);
        System.out.println("removing the element based on the index and values:");
        name.add("rafeek");
        System.out.println(name);
        name.remove("rafeek");
        System.out.println(name);
        name.remove(3);
        System.out.println(name);
        System.out.println(name.size());
        System.out.println("iterating the list using normal for loop:");
        for(int i = 0; i<name.size();i++){
            System.out.println(name.get(i));
        }
        System.out.println("iterating the list using for-each loop:");
        for (String string : name) {
            System.out.println(string);
        }
        
    }
}
