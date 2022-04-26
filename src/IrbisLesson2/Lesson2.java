package IrbisLesson2;

public class Lesson2 {
    public static void main(String[] args) { // цикл for
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i); // массивы ---> далее
//        }
//
//        int[] mass = new int[3]; // вид массива (тип [] имя = new [i];
//        mass[0] = 1;
//        mass[1] = 2;
//        mass[2] = 3;
//
//        int[] mass2 = {1, 2, 3};
//
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = mass[i] + mass2[i]; // объявляем что массив первый становиться новым новым массивом
//            System.out.println(mass[i]);
//        }
//
//        for (int i : mass) { // for each как дублер верхнего
//            System.out.println(i);

            int[][] mass3 = new int[3][3];
            int[][] mass4 = {{1, 2, 3}, {1, 2, 3}}; // тоже самое что и вверх, но с конкретными данными а в верху просто 3 на 3
            int[][] mass5 = new int[3][3];


            for (int y = 0; y < mass3.length; y++) {
                for (int j = 0; j < mass5.length; j++) {
                    mass3[y][j] = 0;
                    System.out.print(mass3[y][j] + " ");
                }
                System.out.println();
            }

        }
    }


