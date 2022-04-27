package Lesson5;

public interface Printer {
    default void print (int a){ // ключевое слово дефолт, позволяющее писать логику в интерфейс, не прописывая логику в классе Lesson5
        System.out.println(a);
    }
}
