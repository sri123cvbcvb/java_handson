import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomObjectOperation {

    public static void main(String[] args) {

    List<Notes> noteLst = new ArrayList<>();
    noteLst.add(new Notes(1, "note1", 11L));
    noteLst.add(new Notes(2, "note2", 22L));
    noteLst.add(new Notes(3, "note3", 33L));
    noteLst.add(new Notes(4, "note4", 44L));
    noteLst.add(new Notes(5, "note5", 55L));

    noteLst.add(new Notes(6, "note4", 66L));


    Map<String, Long> notesRecords = noteLst.stream()
                                            .sorted(Comparator
                                            .comparingLong(Notes::getNot_id)
                                            .reversed()) // sorting is based on TagId 55,44,33,22,11
                                            .collect(Collectors.toMap
                                            (Notes::getNotes, Notes::getNot_id,
                                            (oldValue, newValue) -> oldValue,LinkedHashMap::new));
// consider old value 44 for dupilcate key
// it keeps order
                         
        System.out.println("Notes : " + notesRecords);
    }
}