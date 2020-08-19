package ru.job4j.Calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height-110)*1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short mheight = 180;
        short wheight = 165;
        double man = Fit.manWeight(mheight);
        double woman = Fit.womanWeight(wheight);
        System.out.println("Man 180 is " + man );
        System.out.printf("Woman 165 is " + "%.2f", woman);
    }
}
