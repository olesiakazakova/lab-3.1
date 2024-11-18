package ru.kazakova.main;

import ru.kazakova.geometry.Polyline;
import ru.kazakova.geometry.Square;

public interface Vertices {
    //методы

    public static Polyline getVertices(Square square) {
        Polyline result = square.getVertices();
        return result;
    }
}

