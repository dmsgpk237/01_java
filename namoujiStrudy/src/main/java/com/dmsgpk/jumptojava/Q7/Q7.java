package com.dmsgpk.jumptojava.Q7;

import java.util.ArrayList;
import java.util.Arrays;

public class Q7 {
    // Q7. 리스트를 문자열로 만들기

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "so", "cool"));

        String result = String.join(" ", myList);

        System.out.println(result);
    }
}
