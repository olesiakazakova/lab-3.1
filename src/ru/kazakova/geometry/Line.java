package ru.kazakova.geometry;

public class Line {
    // поля
    private Point start;
    private Point end;

    // свойства
    public Point getStart()
    {
        return this.start;
    };

    public Point getEnd()
    {
        return this.end;
    };

    // конструкторы
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // методы
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
//обновление точек начала и конца линии
    public void update(Point newStart, Point newEnd) {
        this.start = newStart;
        this.end = newEnd;
    }
}
