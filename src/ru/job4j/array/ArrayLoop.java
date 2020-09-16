package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int [] massiv = new int[5];
        for (int i = 0; i< massiv.length; i++) {
            massiv[i] = i * 2 + 3;}
        for (int i : massiv) {


            System.out.println(i);
        }
    }
}
