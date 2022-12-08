package hw_2_task_1;

import java.util.*;

public class Task21 {

    Map<String, List<Integer>> list = new HashMap<>();

    public void list() {
        for (int i = 0; i < 5; i++) {
            list.put(String.valueOf(i), findValuesInAlist());
        }
    }

    private List<Integer> findValuesInAlist() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            list.add(0, 1000);
        }
        return list;
    }

    public Map<String, Integer> changeList() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : list.entrySet()) {
            int summa = 0;
            for (Integer number : entry.getValue()) {
                summa = summa + number;
            }
            result.put(entry.getKey(), summa);
        }
        return result;
    }
}
