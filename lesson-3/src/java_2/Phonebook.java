package java_2;

import java.util.HashMap;
import java.util.HashSet;


public class Phonebook {
    HashMap<String, HashSet<String>> pb;


    public Phonebook() {
        this.pb = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }

    public void findAndPrint(String name) {
        System.out.println("контакное лицо " + name + " - телефон " + pb.getOrDefault(name, new HashSet<>()));
    }
}


