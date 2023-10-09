package ru.otus.lesson3;

public class MainApplication {
    public static void main(String[] args) {
//         локальная переменная а
//        final константа
        final int a = 5;
        int b = 10;
        int result = a + b;
        System.out.println(result);
        byte c = 127;
        c++;
        System.out.println(c);

        float n = 10.04f;
        System.out.println(n);

//        маленькие значения можно засунуть в большое

        int x = (int)10.9f;

        double r = Math.random()*10;
        System.out.println(r);

    }
}
