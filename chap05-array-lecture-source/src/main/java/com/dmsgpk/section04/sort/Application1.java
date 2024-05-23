package com.dmsgpk.section04.sort;

public class Application1 {

    // 배열 ->
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4}; //배열을 정리하는 방법에 대해서 알아보자!

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // num2의 값을 num1에 넣으려고 할 때 num1의 값이 사라지기 때문에 temp라는 함수를 사용해준다.

        int temp;

        //num1의 값을 임시 저장
        temp = num1;

        //num2의 값을 num1에 저장
        num1 = num2;

        //temp에 저장해줬던 num1의 값을 num2에 저장
        num2 = temp;

        System.out.println("========== num1과 num2의 값 교환 ==========");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int[] arr = {2, 1, 3};
        int temp2;

        System.out.println("int[] arr의 값 : " + arr[0] + arr[1] + arr[2]);

        // {1, 2, 3}으로 변경

        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for(int i = 0; i < arr.length; i++) {
            System.out.print("arr[ " + i + " ] : " + arr[i] + " ");
        }

    }
}
