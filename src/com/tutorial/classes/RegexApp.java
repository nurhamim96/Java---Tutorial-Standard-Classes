package com.tutorial.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String value = "Belajar Regular Expression";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(value);

        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
