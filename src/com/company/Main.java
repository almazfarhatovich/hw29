package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Integer[] integers = {13, 12, 14, 11, 34, 23, 50, 60, 56};
        Arrays.stream(integers).filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);
    }
}
/**
 * Integer массивден жуп сандарды
 * терип алынызда
 * алардын квадраттарынын эн чонун табыныз.
 */