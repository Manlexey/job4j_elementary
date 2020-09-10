package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i =2; i<=number-1; i++) {
            prime = true;
            if (( number%i) ==0) {
                prime=false;
                break;
           }
        }
        return prime;
    }
}
