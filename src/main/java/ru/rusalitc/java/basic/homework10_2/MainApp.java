package ru.rusalitc.java.basic.homework10_2;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "89021765368");
        phoneBook.add("Петров", "89149258896");
        phoneBook.add("Сидоров", "89025486123");
        phoneBook.add("Кузнецов", "8450123963");
        phoneBook.add("Павлов", "89993456789");
        phoneBook.add("Романов", "8950269789");
        phoneBook.add("Петров", "89143968741");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("В нашей телефонной книге находится " + phoneBook.size() + " контактов");
            System.out.println("Что Вы хотите сделать?\n1 - Вывести все телефонную книгу\n2 - Найти номер контакта\n0 - Выйти");

            int scanner1 = scanner.nextInt();
            switch (scanner1) {
                case (1):
                    phoneBook.output();
                    break;
                case (2):
                    System.out.println("Введите фамилию для поиска контакта");
                    String scanner2 = scanner.next();
                    if (!phoneBook.containsPhoneNumber(scanner2)) {
                        System.out.println("Такого контакта нет в телеефонной книге");
                        break;
                    }
                    phoneBook.find(scanner2);
                    break;
                case (0):
                    return;


            }
        }
    }
}
