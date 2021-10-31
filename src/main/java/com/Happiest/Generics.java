package com.Happiest;

public class Generics {
    public static void main(String[] args) {
        System.out.println(max(3,4,5));
    }


    public static <T extends Comparable<T>> T max(T x, T y, T z) {

        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return  max;

    }
}
