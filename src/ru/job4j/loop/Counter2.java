package ru.job4j.loop;

public class Counter2 {
    public static int sum(int start, int finish) {
        int sum = 0;
        for ( int a = start;  a <= finish; a+=2) {
            sum = sum + a ;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for ( int a = start; a <= finish; a++ ) {
            if ( a % 2 == 0) {
                sum = sum + a ;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
