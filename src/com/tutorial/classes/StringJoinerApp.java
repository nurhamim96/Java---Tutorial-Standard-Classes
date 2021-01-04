package com.tutorial.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "{", "}");

        joiner.add("Ibad");
        joiner.add("Nurhamim");

        String value = joiner.toString();
        System.out.println(value);
    }
}
