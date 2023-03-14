package org.example.collections;

import java.util.Arrays;
import java.util.HashMap;

public class MAP {
    public static void main(String[] args) {
        HashMap <String,String > map = new HashMap();
        map.put("aKey","aString");
        System.out.println(map.get("aKey"));
        map.put("aKey","bString");
        System.out.println(map.get("aKey"));

    }
}
