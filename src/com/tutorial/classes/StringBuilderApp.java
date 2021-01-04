package com.tutorial.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Ibad");
        builder.append(" ");
        builder.append("Nurhamim");

        String name = builder.toString();
        System.out.println(name);
    }
}
