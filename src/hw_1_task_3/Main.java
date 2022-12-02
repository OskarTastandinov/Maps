package hw_1_task_3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Task3 task = new Task3();

        Map<String, Integer> addMap = task.addMap;

        addMap.put("Номер1", 2);
        addMap.put("Номер2", 1);
        addMap.put("Номер1", 2);
        addMap.put("Номер1", 5);

        System.out.println(addMap);


    }
}
