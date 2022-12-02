package hw_2_task_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Task_2_1 task = new Task_2_1();
        task.list.put("String", List.of(1,6,12));
        task.list.put("String2", List.of(200,150,350));

        System.out.println(task.changeList());


    }
}
