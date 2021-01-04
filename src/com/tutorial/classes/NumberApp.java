package com.tutorial.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();
        System.out.println(shortValue);

        String contoh = "10000";

        Integer contohInt = Integer.valueOf(contoh); // valueOf digunakan untuk menkonversi ke tipe data Object
        int contohIntPrimitif = Integer.parseInt(contoh); // parseInt dll digunakan untuk menkonversi ke tipe data Primitif
        System.out.println(contohInt);
        System.out.println(contohIntPrimitif);
    }
}
