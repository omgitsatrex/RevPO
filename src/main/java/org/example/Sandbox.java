package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sandbox {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(8,9,1,2,3,4,5,6));

        set1.addAll(set2);
        System.out.println(set1);
    }
}
