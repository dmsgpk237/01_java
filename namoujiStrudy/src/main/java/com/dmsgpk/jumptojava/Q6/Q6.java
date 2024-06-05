package com.dmsgpk.jumptojava.Q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q6 {
    // Q6. 리스트를 역순으로 정렬하기

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 6));
        System.out.println(myList);

        Collections.sort(myList);
        System.out.println(myList);


    }
}
