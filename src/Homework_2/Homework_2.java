package Homework_2;

import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        int[][] array1 = {{3, 4, 5}, {4, 5, 6}, {2, 2, 2}}; // 1-ая матрица [3][3] L*M
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }


        int[][] array2 = new int[3][2]; // 2-ая матрица M*N
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[1][0] = 3;
        array2[1][1] = 4;
        array2[2][0] = 5;
        array2[2][1] = 6;

        int[][] array3 = new int[3][2];
        int [][] array4 = new int [2][3];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                for (int k = 0; k < array1[i].length; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
                System.out.print(array3[i][j] + " "); // [3][2]

            }
            System.out.println();
        }
        System.out.println();
// этап транспонирования:
        for (int i = 0; i < array3.length-1; i++) {
            for (int j = 0; j < array3[i].length+1; j++) {
                System.out.print(array3[j][i] + " ");
            }
            System.out.println();
        }

    }

}
