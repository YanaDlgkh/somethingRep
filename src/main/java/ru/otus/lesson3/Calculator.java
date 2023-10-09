package ru.otus.lesson3;

import java.util.Scanner;


// Ввод данных
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);
    }
}
