package Lesson6;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {

        user<Integer, Integer> user1 = new user<>(2, 0); // сами можем обозначать тип данных
        user<Double, BigDecimal> user2 = new user<>(3.1, BigDecimal.valueOf(3.1415920356));
        try {
            user1.getSum(); // пробрасывает ошибку

        } catch (MyException e){

            System.out.println("Я все-таки бедный :(");
            System.out.println(e.getMessage());
            e.printStackTrace(); // путь, как шел до ошибки
        } finally { // все-равно выполнит код после ошибки
            System.out.println("А может и не бедный");
        }



    }


}
//exception - исключения


