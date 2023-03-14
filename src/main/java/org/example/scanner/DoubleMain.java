package org.example.scanner;

import java.util.Arrays;

public class DoubleMain {
    public static void main(String[] args) {
        int a = 34;
        String text = "lala" + a;
        System.out.println(text );

        String textOne = Double.toString(34.55);
        System.out.println(textOne);
        int b = Integer. valueOf("23");
        System.out.println((b + a));
    }
}
