package ru.job4j.calculate;

public class ad {
    private static int person(int a, int b, int c) {
        int rsl;
         if (a > b) {
            rsl = a;
        } else {
            rsl = b;
        }
        if (c > rsl) {
            rsl = c;
        }
        return rsl;
    }





    public static void main(String[] args) {
        int a = 22;
        int b = 40;
        int c = 21;
        int rsl = ad.person(a, b, c);
        System.out.println(rsl);
    }
}
