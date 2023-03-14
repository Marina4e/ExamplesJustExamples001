package org.example.scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double fuilPrice = 58.01;
    double fuilR = 9.8;
    int r;
        System.out.println("Input r and press Enter");
        r = sc.nextInt();
        double sum;
        sum = fuilR/100.0 * fuilPrice * r * 2;
        System.out.println("Total sum = " + sum + "UAH");}



}