package ru.rusalitc.java.basic.homework10_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    Map<String, ArrayList<String>> contacts;


    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void add(String name, String phone) {
        ArrayList<String> list = new ArrayList<>();
        if (contacts.containsKey(name)) {
            list = contacts.get(name);
            list.add(phone);
            contacts.put(name, list);
            return;
        }
        list.add(phone);
        contacts.put(name, list);
    }

    public void find(String name) {
        System.out.println(contacts.get(name));
    }

    public Boolean containsPhoneNumber(String name) {
        return contacts.containsKey(name);
    }

    public int size() {
        return contacts.size();
    }

    public void output() {
        Set<Map.Entry<String, ArrayList<String>>> enrties  = contacts.entrySet();
        for (Map.Entry<String,ArrayList<String>> entry : enrties) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}

