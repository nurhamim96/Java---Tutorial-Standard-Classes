package com.tutorial.classes;

public class MathApp {
    public static void main(String[] args) {
        var min = Math.min(1000, 2000);
        System.out.println(min);

        var max = Math.max(1000, 2000);
        System.out.println(max);

        var ceiling = Math.ceil(1000.421);
        System.out.println(ceiling);

        var floor = Math.floor(1000.421);
        System.out.println(floor);

        calculateAreaWithMathPi(7.0);
    }

    private static void calculateAreaWithMathPi(Double radius) {
        Double area = radius * Math.PI;
        System.out.println("The area of the circle [Radius = " + radius + "]: " + area);
    }
}
