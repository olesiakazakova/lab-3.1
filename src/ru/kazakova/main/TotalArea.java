package ru.kazakova.main;

import ru.kazakova.geometry.*;

public interface TotalArea {
    //методы
    //public double Area();

    //для вычисления общей площади фигур
    public static double totalArea(Figure[] figures) {
        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.Area();
        }
        return totalArea;
    }
}

