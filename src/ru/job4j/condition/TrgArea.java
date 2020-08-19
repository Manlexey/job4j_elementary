package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) /2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c)) ;
        return S;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.printf("area (2, 2, 2) = " + "%.2f", + rsl);
    }
}
