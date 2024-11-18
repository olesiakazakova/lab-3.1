package ru.kazakova.phoneDirectory;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    //поля
    private HashMap<String, String> directory;

    //свойства
    public HashMap<String, String> getDirectory () {
        return directory;
    }

    // конструктор (для инициализации справочника)
    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    // методы
    // для добавления новой пары телефон-имя //сделать проверку!!!!!
    public String add(String phone, String name) {
        if (directory.containsKey(name)) {
            String old = directory.get(name);
            directory.put(name, phone);
            return old;
        }
        directory.put(name, phone);
        return directory.get(name);
    }

    //для удаления значения
    public void delete(String name) {
        directory.remove(name);
    }

    //для получения значений
    public String findPhoneByName(String name) {
        if (directory.get(name) != null) return directory.get(name);
        return "Такого контакта не существует";
    }

    //приведение к строке
    public String toString ( ) {
        if (directory.size()==0) return "Список контактов пуст";
        String s = " ";
        for (Map.Entry<String, String> entry : directory.entrySet()) {
            String name = entry.getKey();
            String phone = entry.getValue();
            s = s + phone + "-" + name + " ";
        }
        return s;
    }

    //проверка наличия телефона
    public String hasPhone(String phone) {
        if(directory.containsValue(phone)) return "Такой номер есть в списке контактов";
        return "Такого номера нет в списке контактов";
    }

    //проверка наличия имени
    public String hasName(String name) {
        if(directory.containsKey(name)) return "Такой контакт есть есть в списке";
        return "Такого контакта нет в списке";
    }

    //количество контактов
    public int getContactCount() {
        return directory.size();
    }

    //получение всех пар в виде массива
    public String[] getAllContact() {//String
        if (directory.size()==0) {
            String[] array = {"Пусто"};
            return array;
        }
        String[] array = new String[directory.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : directory.entrySet()) {
            String name = entry.getKey();
            String phone = entry.getValue();
            array[i] = phone + "-" + name;
            i++;
        }
        return array;
        //return Array.toString(array);
    }

    //получение всех телефонов в виде массива
    public String[] getAllPhone() {
        if (directory.size()==0) {
            String[] array = {"Пусто"};
            return array;
        }
        String[] array = new String[directory.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : directory.entrySet()) {
            String phone = entry.getValue();
            array[i] = phone;
            i++;
        }
        return array ;
    }

    //получение всех имен в виде массива
    public String[] getAllName() {
        if (directory.size()==0) {
            String[] array = {"Пусто"};
            return array;
        }
        String[] array = new String[directory.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : directory.entrySet()) {
            String name = entry.getKey();
            array[i] = name;
            i++;
        }
        return array ;
    }

    //получить массив всех имен, указав часть названия
    public String[] getAllName( String name ) {
        if (directory.size()==0) {
            String[] array = {"Пусто"};
            return array;
        }
        int i = 0;
        for (Map.Entry<String, String> entry : directory.entrySet()) {
            if(entry.getKey(). startsWith(name)) i++;
        }
        if (i==0) {
            String[] array = {"Пусто"};
            return array;
        }
        else {
            String[] array = new String[i];
            i = 0;
            for (Map.Entry<String, String> entry : directory.entrySet()) {
                if (entry.getKey().startsWith(name)) {
                    array[i] = entry.getKey();
                    i++;
                }
            }
            return array;
        }
    }
}
