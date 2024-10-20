public class Ex { //классы
    // в Main
    //        Ex e = new Ex();//вызов конструктора
//        Ex el = new Ex(10, 78);
//        e.setX(6);
//        out.println(e);

    // поля (всегда приватные!!! не публичные)
    private int x, y;
    final int z = 10;//только один раз можно установить

    // свойства
    int setX(int x)
    {
        this.x = x;
        return this.x;
    };
    int getX()
    {
        return this.x;
    };

    // конструкторы (вызываются при создании нового
    // объекта данного класса. Конструкторы выполняют
    // инициализацию объекта.)
    Ex()
    {
        this.x = 0;
        this.y = 0;
    }

    Ex(int x, int y) {
        if (x<0) throw new IllegalArgumentException("x>0");//генерирует
        // исключение IllegalArgumentException,
        // если значение x меньше 0.
        this.x = x;
        this.y = y;
    }

    Ex(int x) {
        this(x,0);
    }

    // методы
    public String toString()
    {
        return "x=" + this.x + "y=" + this.y + "z=" + this.z;
    }
}
