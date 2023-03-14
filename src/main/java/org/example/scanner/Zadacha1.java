package org.example.scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Input number:");
        number = sc.nextInt();
        for (int i = 1; i <=20; i++)
        if (i % number == 0) {
            System.out.print(" * ");}
        else {
            System.out.print( i + " " );

        }
    }
}
