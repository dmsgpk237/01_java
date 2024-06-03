package com.dmsgpk.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    // FileWriter
    public static void main(String[] args) {

        /*
        * FileWriter
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림
        * character(1글자) 단위로 데이터를 처리한다.
        * */

        FileWriter fw = null;
        try {
            // 파일이 존재하지 않으면 파일을 새롭게 생성해준다.
            // 두 번째 인자로 true를 전달하면 이어쓰기가 된다. (기본값은 false)
            fw = new FileWriter("src/main/java/com/dmsgpk/section02/stream/textWriter.txt");

            fw.write(97);

            // 직접 char 자료형으로 내보내기도 가능.
            fw.write('a');

            char[] chrr = {10, 'a', 'b', 'c', 'd', 'e', 10};

            // 문자 배열로 내보내기도 가능
            fw.write(chrr);

            // 문자열로도 가능
            fw.write("안녕하세요!");


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 자원반환
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
