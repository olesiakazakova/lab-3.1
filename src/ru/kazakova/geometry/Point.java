package ru.kazakova.geometry;

public class Point implements Cloneable {
    //поля
    private double x, y;

    //свойства
    public double getX()
    {
        return this.x;
    };

    public double getY()
    {
        return this.y;
    };

    //конструкторы
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //методы
    public String toString()
    {
        return "{" + this.x + ";" + this.y + "}";
    }

    @Override
    public boolean equals(Object o) {
        // Проверяем, ссылается ли объект на сам себя
        if (this == o) return true;
        // Проверяем, является ли объект экземпляром Point
        if (o == null || getClass() != o.getClass()) return false;
        // Приводим объект к типу Point
        Point a = (Point) o;
        // Сравниваем координаты
        return Double.compare(this.x, a.x) == 0 && Double.compare(this.y, a.y) == 0; //Double.compare() сравнивает два заданных значения типа double.
    }

    @Override
    public Point clone()
    {
        Point point = new Point(this.x, this.y);
        return point;
    }
}
