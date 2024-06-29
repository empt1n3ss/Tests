package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        if (contacts.containsKey(name) && contacts.get(name).equals(number)) {
            System.out.println("Вы пытаетесь добавить уже существующий контакт");
        } else {
            contacts.put(name, number);
            System.out.println(contacts);
            System.out.println("Количество контактов " + contacts.size());
        }
        return contacts.size();
    }

    public String findByNumber(){
        return null;
    }
}