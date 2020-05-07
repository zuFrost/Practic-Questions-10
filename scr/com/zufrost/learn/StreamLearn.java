package com.zufrost.learn;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamLearn {

    int[ ] ints;
    Integer[ ] integers;

    public void setup() {
        ints = new Random(1).ints(1000000, 0, 1000)
                .toArray();

        integers = new Random(1).ints(1000000, 0, 1000)
                .boxed().toArray(Integer[]::new);
    }

    public static void main(String[] args) {
        String collect = IntStream
                .range(1, 4)
                .mapToObj(i -> "a" + i)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining("-"));
        System.out.println(collect);




      StreamLearn streamLearn = new StreamLearn();
      streamLearn.setup();


    }
}
