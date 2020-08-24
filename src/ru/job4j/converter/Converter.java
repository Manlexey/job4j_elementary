package ru.job4j.converter;

import java.text.DecimalFormat;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static double euroToLira(double value) {
        double rsl = value / 8.7;
        return rsl;

    }

    public static void main(String[] args) {

        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
         int dollar = Converter.rubleToDollar(180);
         System.out.println("180 rubles are " + dollar + " dollars");
         double lira = Converter.euroToLira(450);
         DecimalFormat df1 = new DecimalFormat("#.##");
         System.out.println("450 euro are " +  " " + lira +  " turc lira");
        int in = 140;
        int expected = 2;
        int out =  rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
         int dol = 180;
         int expectedDol = 60;
         int outD =  rubleToDollar(in);
         boolean passedD = expected == out;
         System.out.println("180 rubles are 3. Test result : " + passed);
          int eurolira = 450;
          double expectedlir = 8.7;
          double outLira = euroToLira(in);
          boolean passedLira = expected == out;
          System.out.println("450 euros are 51.7 Test result : " + passed);

    }
}

