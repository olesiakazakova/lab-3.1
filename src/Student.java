public class Student {
    // поля
    private String name;
    private int[] grades;

    // свойства
    String getName()
    {
        return this.name;
    };

    int[] getGrades() {
        return this.grades;
    }

    // конструкторы
    //конструкторы, созданные для 3 задания
//    Student(String name) {
//        this.name = name;
//    }
//
//    Student(String name, int[] grades) {
//        this.name = name;
//        this.grades = grades.clone();
//    }

    public Student(String name, int... grades) {
        this.name = name;
        this.grades = grades.length > 0 ? grades : new int[0];
    }

    // методы
    public String toString() {
        String s = name + ": ";
        if (grades.length > 0) {
            for (int i = 0; i < grades.length - 1; i++) {
                s = s + grades[i] + ", ";
            }
            s = s + grades[grades.length - 1];
        } else {
            s = s + "оценок нет.";
        }
        return s;
    }

//значение средней оценки
    public double getAverageGrades() {
        if (this.grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.grades.length; i++) {
            sum = sum + this.grades[i];
        }
        return ((double) sum/this.grades.length);
    }
//возвращение информации о том, является ли студент отличником или нет
    public String excellentStudent() {
        if (this.grades.length == 0) {
            return "Не отличник";
        }
        for (int grade : grades) {
            if (grade != 5) {
                return "Не отличник";
            }
        }
        return "Отличник";
    }
}
