package com.company;

public class Main {
    public static void main(String[] args) {

        MathFunctions mathFunctions = new MathFunctions();

        System.out.println(mathFunctions.add(5, 3));
        System.out.println(mathFunctions.sub(10, 4));
        System.out.println(mathFunctions.multiply(2, 5));
        System.out.println(mathFunctions.div(12, 5));
        System.out.println(mathFunctions.abs(-12));
        System.out.println(mathFunctions.pow(2, 4));

    }
}