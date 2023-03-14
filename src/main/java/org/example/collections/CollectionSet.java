package org.example.collections;

import java.util.Arrays;
import java.util.HashSet;

public class CollectionSet {
    public static void main(String[] args) {
        HashSet <String> stringSet = new HashSet<>();
        stringSet.add("testString");
        stringSet.add("testString");
        System.out.println(stringSet.size());
    }
}
