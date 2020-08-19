package ru.job4j.Calculator;

public class MathFunc {

        public static int func1 ( int x){
            int y = x * x + 1;
            return y;
        }


        public static void main (String[]args){
            int result = MathFunc.func1(100);
            System.out.println(result);
        }
    }
