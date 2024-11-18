package ru.kazakova.geometry;

public class Square implements Figure {
    //поля
    private double side;
    private Point angle;

    //свойства
    public Point getAngle() {
        return this.angle;
    };

    public Double getSide(){
        return this.side;
    };

    //конструкторы
    public Square(Point angle, double side) {
        this.angle = angle;
        this.side = side;
    }

    //методы
    public double Area() {
        return this.side*this.side;
    }

    //возвращает массив координат вершин квадрата
    public Polyline getVertices() {
        Point p1 = this.angle;
        Point p2 = new Point(this.angle.getX()+this.side, this.angle.getY());
        Point p3 = new Point(this.angle.getX()+this.side, this.angle.getY()-this.side);
        Point p4 = new Point(this.angle.getX(), this.angle.getY()-this.side);
        Point[] points = {p1, p2, p3, p4};
        return new ClosedPolyline(points); //new Polyline(points);
    }

    public String toString() {
        return "Квадрат в точке " + this.angle + " со стороной " + this.side;
    }
}
