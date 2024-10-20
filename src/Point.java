public class Point {
    //поля
    private double x, y;

    //свойства
    double getX()
    {
        return this.x;
    };

    double getY()
    {
        return this.y;
    };

    //конструкторы
    //конструктор, созданный в 1 задании
//    public Point() {
//        this.x = 0;
//        this.y = 0;
//    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //методы
    public String toString()
    {
        return "{" + this.x + ";" + this.y + "}";
    }
}
