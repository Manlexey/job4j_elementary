package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int j = start; j <= finish; j++) {
            sum = sum + j;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 2));
    }
}
