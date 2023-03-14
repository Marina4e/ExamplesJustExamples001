package org.example.scanner;

import java.util.Arrays;
import java.util.Scanner;

public class scannerIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int max;
        System.out.println("Input a");
        a = sc.nextInt();
        System.out.println("Input b");
        b = sc.nextInt();
        System.out.println("Input c");
        c = sc.nextInt();
        max = a;
        if(b > max) {max = b;}
        if(c > max) {max = c;}
        System.out.println("Maximum =  " + max);
    }
}
