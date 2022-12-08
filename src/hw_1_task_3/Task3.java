package hw_1_task_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Task3 {
    Map<String, Integer> addMap = new HashMap<>();

    public void addMapMethod(String key, int value) {
        if (!addMap.containsKey(key)) {
            addMap.put(key, value);
        } else {
            int valueMapMethod = addMap.get(key);
            if (valueMapMethod == value) {
                throw new IllegalArgumentException("Значения совпадают");
            } else {
                addMap.put(key, valueMapMethod);
            }
        }
    }

    @Override
    public String toString() {
        return addMap.toString();
    }
}
