package com.company;

public class Main {

    public static void main(String[] args) {
        int y = 32; // тип ИМЯ = значение
        System.out.println(y);
        System.out.println("Hello wotld");
        char a = 'а';
        boolean flag = false;
        System.out.println(y + y);
        System.out.println('a' + 'a');
        System.out.println(flag && flag); // && - сложение boolean логические операции
        String string = "string";
        System.out.println(string + a); // - приведение типов (привела один тип к другому)

        if (flag) {
            System.out.println("kek"); // == <, != >, >= или, <= &&
        } else if (y > 33) {
            System.out.println("lol");
        } else {
            System.out.println("лох");
        }

        //Циклы (выполняется до того как условие не станет ложным)
        while (y > 20) {
            y = y - 1; // без конечного условия будет идти бесконечно!
            if (y == 30) {
                continue;
            }
            System.out.println(y);

        }

    }
}
