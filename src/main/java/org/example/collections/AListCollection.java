package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class AListCollection {
    public static void main(String[] args) {
        ArrayList <String> aList = new ArrayList<>();
        aList.add("Test1");
        aList.add("Test2");
        aList.add("Test3");
        System.out.println(aList.contains("Test1"));
        System.out.println(aList.contains("Test2"));
        System.out.println(aList.contains("Test3"));

        aList.remove("Test1");
        System.out.println(aList.contains("Test1"));
        System.out.println(aList.contains("Test2"));
        System.out.println(aList.contains("Test3"));

        aList.clear();
        System.out.println(aList.contains("Test1"));
        System.out.println(aList.contains("Test2"));
        System.out.println(aList.contains("Test3"));
    }

    }

