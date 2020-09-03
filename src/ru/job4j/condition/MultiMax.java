package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int A = first > second ? first : second;
        int B = A > third ? A : third;
        return B;
    }
}