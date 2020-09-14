package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent = percent/100;
        while (amount>0){
            double debt = amount + (amount * percent);
            amount = (int) (debt - salary);
            year++;
        }
        return year;

    }

}
