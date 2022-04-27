package Lesson5;

public class Lesson5 implements Lesson5Interface, Printer {  // (вопрос про Printer?

    @Override // для работы с интерфейсом
    public int squad(int a) {
        return a * a;
    }


}

