package ru.kazakova.main;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
import ru.kazakova.student.*;
import ru.kazakova.phoneDirectory.*;
import ru.kazakova.geometry.*;

//9 вариант

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        //задание1
//        //создание студента
//        Student student = new Student("Иван");
//        //вставляем оценки
//        student.addGrade(5);
//        student.addGrade(3);
//        student.addGrade(4);
//        //out.println("Задание 1\nСоздание студента \"Иван\" с оценками 5, 4, 3, 1.\n");
//        //student.addGrade(1); //срабатывает исключение
//        //student.addGrade(7); //срабатывает исключение
//        out.println("Задание 1\nСоздание студента \"Иван\" с оценками 5, 4, 3.\n" + student.toString());
// //ввод с кл
//        out.println("Выставление оценок студентам\nВведите имя студента:");
//        String name = in.nextLine();
//        Student student = new Student(name);
//        out.println("Введите оценку студента:");
//        boolean p = true;
//        while (true) {
//            String input = in.nextLine();
//            try {
//                int number = Integer.parseInt(input);
//                student.addGrade(number);
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка: Введите целое число.");
//            }
//        }
//        out.println(student.toString());

//
//        //задание2
//        out.println("\nЗадание 2");
//       //создание справочника
//        PhoneDirectory Contacts = new PhoneDirectory();
//       //добавление пар
//        Contacts.add("89222222222","Вова");
//        Contacts.add("89333333333","Лина");
//        Contacts.add("89333333777","Лев");
//        Contacts.add("89227528328","Костя");
//        Contacts.add("89909019090","Рита");
//        Contacts.add("89777777777","Леся");
//        out.println("Все созданные контакты:\n"+Contacts.getDirectory());
//        //добавление пары с уже существующим именем (возвращение старого телефона и замена на новый)
//        out.println("\nСоздание контакта с уже существующим именем \"Рита\" и новым номером телефона \"89909078787\".\nВозвращает старый номер:" + Contacts.add("89909078787","Рита")+"\nОбновленный список контактов:\n"+Contacts.getDirectory());
//        //удаление значения
//        Contacts.delete("Леся");
//        Contacts.delete("Лес");
//        out.println("\nОбновленный список после удаления контакта \"Олеся\":\n"+Contacts.getDirectory());
//        //получение значений по имени(возвращение телефона)
//        out.println("\nПолучение номера телефона по имени. Например \"Вова\"\nНомер телефона: " + Contacts.findPhoneByName("Вова"));
//        out.println("Запрос номера телефона по имени, которого нет в списке. Например \"Настя\"\n" + Contacts.findPhoneByName("Настя"));
//        //приведение справочника в строке
//        out.println("\nПриведение справочника к строке: "+Contacts.toString());
//        //проверка наличия телефона
//        out.println("\nПроверка наличия номера телефона в списке.\nНомер \"89212123123\": " + Contacts.hasPhone("89212123123"));
//        out.println("Номер \"89222222222\": "  + Contacts.hasPhone("89222222222"));
//        //имени
//        out.println("\nПроверка наличия имени в списке.\nИмя \"Лина\": " + Contacts.hasName("Лина"));
//        out.println("Имя \"Тимур\": " + Contacts.hasName("Тимур"));
//        //текущее кол-во контактов
//        out.println("\nСписок контактов:\n"+Contacts.getDirectory());
//        out.println("Количество контактов:"+Contacts.getContactCount());
//        //запрос всех пар в виде массива
//        out.println("\nЗапрос всех контактов в виде массива\n"+ Arrays.toString(Contacts.getAllContact()));
//        //всех телефонов
//        out.println("\nЗапрос всех телефонов в виде массива\n"+Arrays.toString(Contacts.getAllPhone()));
//        //всех имен
//        out.println("\nЗапрос всех имен в виде массива\n"+Arrays.toString(Contacts.getAllName()));
//        //массив имен, указав часть названия
//        out.println("\nЗапрос всех имен на \"Л\"\n"+Arrays.toString(Contacts.getAllName("Л")));
//        out.println("Запрос всех имен на \"Ле\"\n"+Arrays.toString(Contacts.getAllName("Ле")));
//
//        //задание3
//        out.println("\nЗадание 3\nСоздание трехмерной точки с координатами (1, 2, 3)");
//        Point3D point3D = new Point3D(1, 2, 3);
//        out.println("Вывод точки: " + point3D);
//
//        //задание4
//        out.println("\nЗадание 4");
//        Figure circle = new Circle(new Point(0, 0), 5);
//        Figure square = new Square(new Point(5,4), 10);
//        Figure rectangle = new Rectangle(new Point(6,6), 4, 6);
//        Figure triangle = new Triangle(new Point(0, 0),new Point( -4, 0), new Point( 2, 3));
//        out.println(circle);
//        out.println("Площадь: " + circle.Area());
//        out.println(square);
//        out.println("Площадь: " + square.Area());
//        out.println(rectangle);
//        out.println("Площадь: " + rectangle.Area());
//        out.println(triangle);
//        out.println("Площадь: " + triangle.Area());
//
//        //задание5
//        out.println("\nЗадание 5 (Общая площадь)");
//        Figure[] figures = new Figure[] {
//                new Circle(new Point(0, 0), 5),
//                new Circle(new Point(-3, -5), 4),
//                new Square(new Point(10,10), 7),
//                new Square(new Point(5,4), 10),
////                new Rectangle(new Point(6,6), 4, 6),
////                new Triangle(new Point(0, 0),new Point( 4, 0), new Point( 2, 3))
//        };
//        out.println("Круги с радиусами 5 и 4, квадраты со сторонами 7 и 10");
//        out.println("Общая площадь фигур: " + Figure.totalArea(figures));
//
//        Square square5 = new Square(new Point(10,10), 7);
//        out.println("Задание 5 (Замкнутый квадрат)\n" + square5.toString());
//        out.println(square5.getVertices());
//
//        //задание6
//        out.println("\nЗадание 6");
//        Point p1 = new Point(1.0, 2.0);
//        Point p2 = new Point(1.0, 2.0);
//        Point p3 = new Point(3.0, 4.0);
//        out.println("Сравнение точек р1 = (1.0, 2.0) и р2 = (1.0, 2.0): "+p1.equals(p2));
//        out.println("Сравнение точек р1 = (1.0, 2.0) и р3 = (3.0, 4.0): "+p1.equals(p3));
//
//        //задание7
//        out.println("\nЗадание 7 (Общая площадь)");
//        Figure[] figures7 = new Figure[] {
//                new Circle(new Point(0, 0), 5),
//                new Circle(new Point(-3, -5), 4),
//                new Square(new Point(10,10), 7),
//                new Square(new Point(5,4), 10),
////                new Rectangle(new Point(6,6), 4, 6),
////                new Triangle(new Point(0, 0),new Point( 4, 0), new Point( 2, 3))
//        };
//        out.println("Круги с радиусами 5 и 4, квадраты со сторонами 7 и 10");
//        out.println("Общая площадь фигур: " + TotalArea.totalArea(figures7));
//
//        Square square7 = new Square(new Point(10,10), 7);
//        out.println("Задание 7 (Замкнутый квадрат)\n" + square7.toString());
//        out.println(Vertices.getVertices(square7));

//        out.println("\nЗадание 7.3");
//        if (args.length < 2) {
//            out.println("Необходимо передать два аргумента: x и y.");
//            return;
//        }
//        try {
//            double result = Power.calculate(args[0], args[1]);
//            out.println("Результат возведения " + args[0] + " в степень " + args[1] + " равен: " + result);
//        } catch (NumberFormatException e) {
//            out.println("Ошибка: оба аргумента должны быть числами.");
//        }

//        //задание8
//        out.println("\nЗадание 8 (Клонирование точки)");
//        Point originalPoint = new Point(5.0, 10.0);
//        Point copiedPoint = originalPoint.clone();
//        System.out.println("Изначальная точка: " + originalPoint);
//        System.out.println("Копия: " + copiedPoint);
    }
}