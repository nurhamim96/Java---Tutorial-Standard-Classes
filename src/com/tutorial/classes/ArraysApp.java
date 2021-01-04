package com.tutorial.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,3,4,5,76,8,9,5,43,5,7,56,32,45
        };
        /* Sorting Arrays */
        Arrays.sort(numbers);

        /* Konversi int array ke String */
        System.out.println(Arrays.toString(numbers));

        /* Search array */
        System.out.println("Angka 76 ada di index ke : " +  Arrays.binarySearch(numbers, 76));

        /* Copy data array */
        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        /* Copy data array dari index sampai index sekian */
        int[] values = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(values));
    }
}
