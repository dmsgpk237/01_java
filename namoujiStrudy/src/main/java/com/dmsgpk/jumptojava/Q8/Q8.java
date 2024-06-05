package com.dmsgpk.jumptojava.Q8;

import java.util.HashMap;

public class Q8 {
    public static void main(String[] args) {

        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        grade.put("D", 60);
        grade.put("E", 50);

        int result = grade.remove("B");

        System.out.println(result);
        System.out.println(grade);
    }
}
