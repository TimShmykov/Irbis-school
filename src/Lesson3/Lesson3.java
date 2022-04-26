package Lesson3; // хоткей для переименования - shift + F6

public class Lesson3 {
    public static void main(String[] args) {// в начале модификаторы, потом возвращаемый тип, потом название и в() - параметры
        call("It's me, Malario! ");
        plus(1, 2); // вызыв метода
        plus(2, 4);

        Student.GetInfo(); // - вызываем статический метод (не создавая студента можно получить инфо)

        Student a = new Student(); // вызываем поля студента и его методы
        a.GetInfo2();

        Human b = new Student(); // вызвали конструктор, который находиться в классе стьюдет ПОЛИМОРФИЗМ!!
        System.out.println(b.age);
        b.NameAge();
    }


    static void call(String NightCall) {
        System.out.println(NightCall); // метод который принимает строку и выводит ее в консоль, даем методу функционал
    }

    // public - виден всему коду
// метод доступен только внутри пакета
// private - доступ только внутри класса
// protected - доступен для наследников
// return - вызывает обратно

    static void plus(int a, int b) {
        System.out.println(a + b);

    }


}

// ДЗ: создать зоопарк - один тип общие свойства в родительский класс а доп свойства уже конкретно
// в цикле посчитать сколько животных умеют летать, звучать
// все животные в одном массиве!
// Human[] n = {new Student(ИМя, Возраст), new Teacher()...


