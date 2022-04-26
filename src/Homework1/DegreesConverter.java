package Homework1;

import java.util.Scanner;

public class DegreesConverter {
    public static void main(String[] args) {
        System.out.println("Celsius to Farenheit converter");
        System.out.print("Ввудите градусы в Цельсиях: ");
        Scanner scanner = new Scanner(System.in);
        float Celsius = scanner.nextFloat();
        float Farenheit = (Celsius * 9 / 5) + 32;
        System.out.println(Farenheit + "\u00B0 по Фаренгейту");
    }
}
