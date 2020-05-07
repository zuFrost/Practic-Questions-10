package com.zufrost.learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "null");
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "thee");
        hashMap.put(4, "fore");
        hashMap.put(5, "five");
        hashMap.put(6, "five");
        System.out.println(hashMap);
////        hashMap.stream()
//        Stream<String> streamFromHashMap;
        List<String> arrayList = new ArrayList<>();
        arrayList.addAll(hashMap.values());
        System.out.println(arrayList);

    }
}
