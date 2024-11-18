package ru.kazakova.geometry;
//abstract class ru.kazakova.geometry.Figure { //для задания 4
//    public abstract double Area();
//}

public interface Figure {
    //методы
    //для вычисления площади фигуры
    public double Area();

    //для вычисления общей площади фигур
    public static double totalArea(Figure[] figures) {
        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.Area();
        }
        return totalArea;
    }

    //С использованием модификатора static объявляются методы и переменные,
    // которые не нуждаются в объекте класса. Таким образом, методы и переменные
    // вызываются от класса, а не от объекта.
}



