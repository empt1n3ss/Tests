package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> nameToNumber = new HashMap<>();;
    private Map<String, String> numberToName = new HashMap<>();;

    public int add(String name, String number) {
        if (nameToNumber.containsKey(name) && nameToNumber.get(name).equals(number)) {
            System.out.println("Вы пытаетесь добавить уже существующий контакт");
        } else {
            nameToNumber.put(name, number);
            numberToName.put(number, name);
            System.out.println(nameToNumber);
            System.out.println("Количество контактов " + nameToNumber.size());
        }
        return nameToNumber.size();
    }

    public String findByNumber(String number){
        System.out.println(numberToName.get(number));
        return numberToName.get(number);
    }

    public String findByName(String name) {
        System.out.println(nameToNumber.get(name));
        return nameToNumber.get(name);
    }
    public String printAllNames() {
        return null;
    }
}