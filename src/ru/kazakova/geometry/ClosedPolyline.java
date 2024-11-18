package ru.kazakova.geometry;

import java.util.Arrays;

public class ClosedPolyline extends Polyline {
    //поля
    private Point[] points;

    // Свойства
    public Point[] getPoints() {
        return points;
    }

    //конструкторы
    public ClosedPolyline (Point[] points) {
        this.points = points;
    }

    public String toString() {
        return "Линия " + Arrays.toString(this.getPoints()) + ", " + points[0] + "]";
    }
};
