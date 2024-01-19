package com.company;

public class MathFunctions {

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double div(double x, double y) {
        String str = "Something wrong";
        if (y != 0) {
            return x / y;
        } else {
            return Double.parseDouble(str);
        }
    }

    public double abs(double a) {
        return Math.abs(a);
    }

    public double pow(double x, double y) {
        return Math.pow(x, y);
    }

}
