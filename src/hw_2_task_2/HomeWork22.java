package hw_2_task_2;
import java.util.LinkedHashMap;
import java.util.Map;

public class HomeWork22 {
public static void main(String[] args) {
        Map<Integer, String> addToCollection = new LinkedHashMap<>();
        addToCollection.put(2, "Номер2");
        addToCollection.put(1, "Номер1");
        addToCollection.put(3, "Номер3");
        addToCollection.put(5, "Номер5");
        addToCollection.put(4, "Номер4");
        addToCollection.put(6, "Номер6");
        addToCollection.put(8, "Номер8");
        addToCollection.put(7, "Номер7");
        addToCollection.put(10, "Номер10");
        addToCollection.put(13, "Номер13");

        for (Map.Entry<Integer, String> entry : addToCollection.entrySet()) {

        System.out.println(entry.getKey() + " " + entry.getValue());
        }

}

}
