package com.egor.java;

import com.egor.java.interfaces.Calculator;

/**
 * @author yshybeka
 */
public class Java8Example {

    public static  void main(String[] args) {
        System.out.println("Test");
        System.out.println(calculate((double a, double b) ->
                a + b
                , 2d, 5d));
    }

    private static double calculate(Calculator calculator, double a, double b) {
        return calculator.calculate(a, b);
    }
}
