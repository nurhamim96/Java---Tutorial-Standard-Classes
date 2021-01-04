package com.tutorial.classes;

public class SytemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.getenv("APP"));
        System.gc(); //Menjalankan Garbage Collection Manual
        System.exit(0);
    }
}
