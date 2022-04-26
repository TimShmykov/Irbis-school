package Lesson3;

public class Student extends Human {  // ниже - поля класса, extends - наследует
    // String name = "Tim ";
    // int age = 24;
    String HairColour;
    int height;

    // - конец полей
    // объекты делать через конструктор - это метод который возвращает тип нашего класса
    public Student() {
        this.height = 185;
        this.HairColour = "black ";
        this.name = "Tim ";
        this.age = 24;
    }

    static void GetInfo() {
        System.out.println("Hi");
    }

    void GetInfo2() {
        System.out.println(name + " " + age + " " + HairColour + " " + height);
    }


}



