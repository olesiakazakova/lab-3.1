package ru.kazakova.geometry;

public class Triangle implements Figure {
    //поля
    private Point p1;
    private Point p2;
    private Point p3;

    //свойства
    public Point getPoint1() {
        return this.p1;
    };

    public Point getPoint2() {
        return this.p2;
    };

    public Point getPoint3() {
        return this.p3;
    };

    //конструкторы
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //методы
    public double Area() {
        return Math.abs(((this.p1.getX() - this.p3.getX()) * (this.p2.getY() - this.p3.getY()) - (this.p2.getX() - this.p3.getX()) * (this.p1.getY() - this.p3.getY())) / 2);
    }

    public String toString() {
        return "Треугольник с вершинами в точках " + this.p1 + ", " + this.p2 + ", " + this.p3;
    }
}

