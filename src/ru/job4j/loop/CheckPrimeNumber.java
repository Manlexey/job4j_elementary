package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; i <= number; i++) {
            prime = true;
            if ( (number%i==0 && number !=i)) {
                prime = false;
                break;
            }
        }

            return prime;
        }

}
