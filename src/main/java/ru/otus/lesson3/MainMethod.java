package ru.otus.lesson3;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("start");
        sum3(3,4,5);
        sum3(12,30,5);
        System.out.println("finish");

        int x = 50;
        while (x<100){
            x +=20;
            System.out.println(x);

        }

        printStarTimes(20);




    }

    public static void printStarTimes(int times){
        while (times>0){
            times--;
            System.out.println("*");
        }
    }


//    метод
    public static void sum3(int a, int b, int c){

        int sum = a + b + c;
        System.out.println(sum);

    }


}
