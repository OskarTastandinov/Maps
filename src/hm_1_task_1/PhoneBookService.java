package hm_1_task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBookService {

    Map<FullName, String> phoneBook = new HashMap<>();

    public void add(FullName fullName, String phoneNumber) {
        phoneBook.put(fullName, phoneNumber);
    }

    public Set<Map.Entry<FullName, String>> getValues(){
        return phoneBook.entrySet();
    }

}
