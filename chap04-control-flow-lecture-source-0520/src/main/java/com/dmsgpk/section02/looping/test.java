package com.dmsgpk.section02.looping;

import java.util.Scanner;

public class test {

//    public void printStar(int row) {
//        for(int j = 1; j <= row; j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }

    public void printTriangleStar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄의 수를 입력하세요");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){ // i는 1이고, i가 로우 값과 작거나 같을 때까지 i를 하나씩 증가시킨다.

            for(int j = 1; j <= i; j++){ //j는 1이고, j가 i 값과 같거나 작을 때까지 j를 하나씩 증가시킨다.

                System.out.print("*"); // 별 출력

            }

            System.out.println(); //줄띄움

        }

    }


    public void printTriangleStar2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("반복하고 싶은 숫자를 입력하세요!");
        int row = sc.nextInt();


        for(int i = 0; i < row; i++){

            for(int j = 0; j < i; j++){
                System.out.print(" ");

            }
            for (int j = row; j > i; j--){
                System.out.print("*");
            }

            System.out.println();

        }


    }

    public void printTriangleStar3() {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < 10; i += 2) {

            for (int j = 9; j > i; j -= 2) {
                System.out.print(" ");
            }
                for (int j = 0; j < i; j++) {

                    System.out.print("*");
                }

            System.out.println();

        }

    }

}
