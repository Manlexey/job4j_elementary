package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int x=0; x < pref.length;x++) {
            if (word[x] != pref[x]) {
                result=false;
                break;
            }
        }
        return result;
    }
}
