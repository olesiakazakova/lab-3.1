public class Line {
    // поля
    private Point start;
    private Point end;

    // свойства
    Point getStart()
    {
        return this.start;
    };

    Point getEnd()
    {
        return this.end;
    };

    // конструкторы
    //конструктор, созданный при решении задания 2
    //не работает, тк объект Point можно создать только путем указания обеих координат
//    public Line() {
//        this.start = new Point();
//        this.end = new Point();;
//    }

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
