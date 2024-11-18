package ru.kazakova.geometry;

public class Rectangle implements Figure {
    //поля
    private double side1;
    private double side2;
    private Point angle;

    //свойства
    public Point getAngle() {
        return this.angle;
    };

    public Double getSide1(){
        return this.side1 ;
    };

    public Double getSide2(){
        return this.side2 ;
    };

    //конструкторы
    public Rectangle(Point angle, double side1, double side2) {
        this.angle = angle;
        this.side1 = side1;
        this.side2 = side2;
    }

    //методы
    public double Area() {
        return this.side1*this.side2;
    }
    public String toString() {
        return "Прямоугольник в точке" + this.angle + " и длинами сторон " + this.side1 + " и " + this.side2;
    }
}
