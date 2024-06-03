package com.dmsgpk.section03.filterStream;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 형변환 보조스트림
         * 기본(기반) 스트림이 byte기반 스트림이고 보조 스트림이 char 기반 스트림인 경우 사용한다.
         * 기본 스트림과 보조 스트림의 타입이 맞지 않을 때 형변환 해주는 스트림
         * */

        /*
         * 표준 스트림
         * 자바에서 콘솔이나 키보드 같은 표준 입출력 장치로부터 데이터를 입출력하기 위한 스트림을 제공한다.
         * System 클래스의 필드 in, out, err가 대상 데이터의 스트림을 의미한다.
         * System.in (inputStream) : 콘솔로부터 데이터를 입력받는다.
         * System.out (PrintStream) : 콘솔로 데이터를 출력한다.
         * System.err (PrintStream) : 콘솔로 데이터를 출력한다.
         * */

        /*
         * System.in을 InputStreamReader로 변환 (바이트 기반 스트림 -> 문자 기반 스트림)
         * Buffered를 이용한 보조스트림과 연결
         *
         * */

        // 바이트 기반 스트림이 System.in을 사용해서 문자열 기반 스트림으로 변경된 것.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("문자열 입력 : ");

        try {
            String value = br.readLine();

            System.out.println("value : " + value);

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("java mysql jdbc");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
