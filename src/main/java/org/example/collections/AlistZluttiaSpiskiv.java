package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class AlistZluttiaSpiskiv {
    public static void main(String[] args) {
        ArrayList<String>aList =new ArrayList<>();
        ArrayList<String>bList =new ArrayList<>();
         aList.add("Alice");
         aList.add("Bob");

         bList.add("Sara");
         bList.add("Joe");
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }
         aList.addAll(bList);
        System.out.println("===========================================================");
        aList.removeAll(bList);
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }
}
