package Lesson6;

public class MyException extends Exception {
    @Override
    public String getMessage() {
        return "Что-то пошло не так :( ";
    }

}

// Д/з class Matrix <E> extends Number
// должен быть конструктор Matrix ( E [] [])
// должно быть ва метода
// plus(Matrix<>)
// mult(M)
// как задать умножение без тройного цикла 