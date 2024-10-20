import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;

//9 вариант

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //задание 1
        out.println("Введите координаты трех точек");
        Point[] points = new Point[3];

        for (int i = 0; i < points.length; i++) {
            while (true) {
                try { //код, который может вызвать исключение
                    out.println("Введите координату X для " + (i+1) + "-ой точки: ");
                    double x = Double.parseDouble(in.nextLine());

                    out.println("Введите координату Y для " + (i+1) + "-ой точки: ");
                    double y = Double.parseDouble(in.nextLine());

                    points[i] = new Point(x, y);
                    break; // Выход из цикла, если ввод успешен
                } catch (NumberFormatException e1) { //Ошибка преобразования из строки в число
                    System.out.println("Некорректный ввод. Введите одно числовое значение");
                }
            }
        }

        out.println("Созданные точки:");
        for (Point point : points) {
            out.println(point);
        }

        out.println();
        //задание 2
        Point spl1 = new Point(1, 3);
        Point epl1 = new Point(23, 8);
        Line line1 = new Line(spl1, epl1);

        Point spl2 = new Point(5, 10);
        Point epl2 = new Point(25, 10);
        Line line2 = new Line(spl2, epl2);

        Line line3 = new Line(spl1, epl2);

        out.println("(Задание 2 пункты 1, 2, 3) Созданные три линии:");
        out.println(line1);
        out.println(line2);
        out.println(line3);

        while (true) {
            try {
                out.print("Введите координату X для точки начала 1-ой линии: ");
                double x1 = Double.parseDouble(in.nextLine());

                out.print("Введите координату Y для точки начала 1-ой линии: ");
                double y1 = Double.parseDouble(in.nextLine());

                out.print("Введите координату X для точки конца 1-ой линии: ");
                double x2 = Double.parseDouble(in.nextLine());

                out.print("Введите координату Y для точки конца 1-ой линии: ");
                double y2 = Double.parseDouble(in.nextLine());

                line1.update(new Point(x1, y1), new Point(x2, y2));

                break;
            } catch (NumberFormatException e2) {
                System.out.println("Некорректный ввод. Введите одно числовое значение");
            }
        }

        while (true) {
            try {
                out.print("Введите координату X для точки начала 2-ой линии: ");
                double x1 = Double.parseDouble(in.nextLine());

                out.print("Введите координату Y для точки начала 2-ой линии: ");
                double y1 = Double.parseDouble(in.nextLine());

                out.print("Введите координату X для точки конца 2-ой линии: ");
                double x2 = Double.parseDouble(in.nextLine());

                out.print("Введите координату Y для точки конца 2-ой линии: ");
                double y2 = Double.parseDouble(in.nextLine());

                line2.update(new Point(x1, y1), new Point(x2, y2));

                break;
            } catch (NumberFormatException e3) {
                System.out.println("Некорректный ввод. Введите одно числовое значение");
            }
        }

        line3.update(line1.getStart(), line2.getEnd());

        out.println("(Задание 2 пункт 4) Измененные три линии:");
        out.println(line1);
        out.println(line2);
        out.println(line3);

        while (true) {
            try {
                out.print("Введите координату X для точки начала 1-ой линии: ");
                double x1 = Double.parseDouble(in.nextLine());

                out.print("Введите координату Y для точки начала 1-ой линии: ");
                double y1 = Double.parseDouble(in.nextLine());

                out.print("Введите координату X для точки конца 1-ой линии: ");
                double x2 = Double.parseDouble(in.nextLine());

                out.print("Введите координату Y для точки конца 1-ой линии: ");
                double y2 = Double.parseDouble(in.nextLine());

                line1.update(new Point(x1, y1), new Point(x2, y2));

                break;
            } catch (NumberFormatException e4) {
                System.out.println("Некорректный ввод. Введите одно числовое значение");
            }
        }

        out.println("(Задание 2 пункт 5) Три линии после изменения первой линии:");
        out.println(line1);
        out.println(line2);
        out.println(line3);

        out.println();
        //задание 3
        int[] vasyaGrades = {3, 4, 5};
        Student Vasya = new Student("Вася", vasyaGrades);
        Student Petya = new Student("Петя", Vasya.getGrades());

        out.println("(Задание 3 пункты 1, 2)\nСоздание студентов Пети и Васи с оценками: 3,4,5");
        out.println(Vasya);
        out.println(Petya);

        Petya.getGrades()[0] = 5;

        out.println("(Задание 3 пункт 3)\nЗамена первой оценки Пети на 5");
        out.println(Vasya);
        out.println(Petya);
        //объяснение результата
        // Так как при копировании оценок Васи в оценки Пети,
        // оценки были переданы по ссылке,
        // то при изменении массива с оценками Пети изменились оценки Васи

        int[] andreyGrades = Arrays.copyOf(Vasya.getGrades(), Vasya.getGrades().length);
        Student Andrey = new Student("Андрей", andreyGrades);

        out.println("(Задание 3 пункт 4)\nСоздание студента Андрея и копирование ему оценок Васи");
        out.println(Vasya);
        out.println(Andrey);
        //проверка
        vasyaGrades[0] = 4;
        out.println("Проверка влияния изменений оценок Васи на оценки Андрея");
        out.println(Vasya);
        out.println(Andrey);

        out.println();
        //задание 4.1
        Point point1 = new Point(3,5);
        Point point2 = new Point(25,6);
        Point point3 = new Point(7,8);

        out.println("(Задание 4.1) Созданные точки:");
        out.println(point1);
        out.println(point2);
        out.println(point3);

        out.println();
        //задание 4.7
        Student Vasya2 = new Student("Вася", 3, 4, 5);
        Student Maxim = new Student("Максим");

        out.println("(Задание 4.7) Созданные студенты Вася с оценками: 3,4,5 и Максим без оценок");
        out.println(Vasya2);
        out.println(Maxim);

        out.println();
        //задание 5.6
        int[] vasyaGrades5 = {3, 4, 5, 4};
        int[] petyaGrades5 = {5, 5, 5, 5};

        Student Vasya5 = new Student("Вася", vasyaGrades5);
        Student Petya5 = new Student("Петя", petyaGrades5);

        out.println("(Задание 5.6) Создание студентов Васи с оценками 3,4,5,4 и Пети с оценками 5,5,5,5\nИнформация о данных студентах:");
        out.println(Vasya5);
        out.println("Значение средней оценки: " + Vasya5.getAverageGrades());
        out.println(Vasya5.excellentStudent());
        out.println(Petya5);
        out.println("Значение средней оценки: " + Petya5.getAverageGrades());
        out.println(Petya5.excellentStudent());
    }
}