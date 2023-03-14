package org.example.scanner;

import java.util.Arrays;
import java.util.Scanner;

public class TernarnyjOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Input a");
        a = sc.nextInt();
        System.out.println("Input b");
        b = sc.nextInt();
        if(a < b) {
            System.out.println("a<b");}
        else {
            if (a>b) {
                System.out.println("a>b");
            }
            else {
                System.out.println(" a = b");}
        }

    }
}
