package ru.kazakova.geometry;

public class Circle implements Figure {
    //поля
    private double radius;
    private Point center;

    //свойства
    public double getR() {
        return this.radius;
    }

    public Point getC() {
        return this.center;
    }

    //конструкторы
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    //методы
    public double Area() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "Круг с центром в точке " + this.center + " и радиусом равным " + this.radius;
    }
}
