import hm_1_task_1.FullName;
import hm_1_task_1.PhoneBookService;

public class Main {
    public static void main(String[] args) {
        PhoneBookService phoneBookService = new PhoneBookService();
        FullName ivanov = new FullName("Иванов", "Иван");
        FullName sidorov = new FullName("Сидоров", "Олег");
        FullName petrov = new FullName("Петров", "Илья");
        FullName vasin = new FullName("Васин", "Дмитрий");
        FullName gavrilova = new FullName("Гаврилова", "Олеся");
        FullName lukianova = new FullName("Лукьянова", "Ольга");
        FullName smirnov = new FullName("Смирнов", "Сергей");
        FullName potemkin = new FullName("Потемкин", "Александр");
        FullName grigorieva = new FullName("Григорьева", "Алена");
        FullName semionova = new FullName("Семенова", "Наталья");

        phoneBookService.add(ivanov, " 123123");
        phoneBookService.add(sidorov, " 456456");
        phoneBookService.add(petrov, " 789789");
        phoneBookService.add(vasin, " 987987");
        phoneBookService.add(gavrilova, " 654654");
        phoneBookService.add(lukianova, " 321321");
        phoneBookService.add(smirnov, " 147147");
        phoneBookService.add(potemkin, " 258258");
        phoneBookService.add(grigorieva, " 369369");
        phoneBookService.add(semionova, " 753357");

        System.out.println(phoneBookService.getValues());


    }
}
