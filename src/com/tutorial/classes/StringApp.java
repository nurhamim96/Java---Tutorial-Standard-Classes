package com.tutorial.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Ibad Nurhamim";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();


        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Ibad"));
        System.out.println(name.endsWith("Nurhamim"));

        String[] names = name.split(" ");
        for (var value : names){
            System.out.println(value);
        }
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(name.charAt(0));

        System.out.println("===============================");
        char[] chars = name.toCharArray();
        for (var values : chars) {
            System.out.println(values);
        }
    }
}
