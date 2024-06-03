package com.dmsgpk.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 입출력 스트림
        * 프로그래밍 할 때 많은 종류의 데이터를 다루어야 한다.
        * 하지만 데이터는 프로그램 냅에 있을 수도 있지만,
        * 프로그램 외부의 데이터를 가져와서 사용해야 할 수도 있다.
        *
        * 외부 데이터란 프로그램 외부에 존재하는 모든 데이터를 의미한다.
        * 외부 데이터는 하드디스크 상의 파일이 될 수도 있고, 네트워크 상에 존재하는 자원이 될 수도 있다.
        * 외부 데이터를 대상으로 작업할 때 연결된 길을 스트림(Stream)이라고 한다.
        * 스트림은 단방향이기 때문에 데이터를 읽어올 때는 입력스트림, 데이터를 출력할 때는 출력스트림이라고 한다.
        * > Scanner sc = new Scanner(System.in); //입력스트림
        * > System.out.Println(); //출력스트림
        *
        *
        * 입력 & 출력 스트림
        * InputStream, Reader => 데이터를 읽어오는 스트림
        * OutputStream, Writer => 데이터를 내보내는 스트림
        * >> 영어는 1문자에 1바이트지만, 한글은 한 문자에 3바이트임,
        * 그래서 InputStream과 OutStream을 사용하면 한글은 깨지게 됨.
        * Reader, Writer (2바이트 혹은 3바이트) 단위로 작업
        * */

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/main/java/com/dmsgpk/section02/stream/testInputStream.txt");

            // 1. 1 Byte씩 반복해서 읽기
//            int value;
//
//            //read() : 파일에 기록된 값을 순차적으로 읽어오고 더 이상 읽어올 게 없으면, -1을 반환
//            // 1Byte씩 반복해서 읽어오는 작업
//            while ((value = fin.read()) != -1) {
//
//                // 값을 정수로 읽어온다.
//                System.out.println(value);
//
//                // 문자로 출력하고 싶은 경우 형변환을 통헤 가능하다.
//                System.out.println((char) value);
//
//            }

            // 2. byte 배열로 파일 한 번에 읽기

            int size = (int) new File("src/main/java/com/dmsgpk/section02/stream/testInputStream.txt").length();
            System.out.println("파일의 길이 : " + size);

            byte[] bar = new byte[size];

            //read(): 메소드의 인자로 byte 배열을 넣으면 파일을 읽어서 바이트 배열로 반환해줌.
            fin.read(bar);

            // 한 개씩 읽어오는 것보다 속도가 빠르다. 한 개씩 읽어오는 건 잘 쓰지 않음.
            // 테스트 파일 안에 한글 넣으면 이상하게 나옴.

            for (int i = 0; i < bar.length; i++) {
                System.out.println((char) bar[i]);
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fin != null) {
                    try {

                        /*
                        * 자원을 반납하지 않으면(스트림을 닫지 않으면), 장기간 실행중인 프로그램의 경우, 다양한 자원에서 누수(leak)가 발생한다.
                        * 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 남아있는 데이터를 강제로 전송해야 한다.
                        * 잔류데이터가 남은 상황에서 추가로 스트림을 사용하면, 데드락(DeadLock) 교착 상태가 된다.
                        * 데드락은 면접 질문에서 많이 나옴.
                        * */
                        fin.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            }
        }

    }
}
