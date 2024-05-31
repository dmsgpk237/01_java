package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당

        // 클래스를 인스턴스 배열로 만들 수 있음.

        StudentDTO[] sDTO = new StudentDTO[3];

        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        sDTO[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        sDTO[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        sDTO[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        // 학생 정보 모두 출력
        System.out.println("========== 한 개씩 낱개로 보여줌 ==========");
        System.out.println(sDTO[0].toString());
        System.out.println(sDTO[1].toString());
        System.out.println(sDTO[2].toString());

        System.out.println();

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setGrade(1);
        studentDTO.setMajor("정보시스템공학과");


        // 향상된 for문으로 학생 정보 모두 출력
        System.out.println("========== 향상된 for문으로 보여줌 ==========");
        for (StudentDTO s: sDTO) {
            System.out.println(s);

        }

        System.out.println();
        System.out.println("=======================================");



        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 y면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트 함

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        EmployeeDTO[] eDTO = new EmployeeDTO[10];
        EmployeeDTO employeeDTO = new EmployeeDTO();

        // 사원들의 정보를 키보드로 계속 입력받고
        System.out.println("사원의 정보를 입력하고 저장하는 프로그램입니다.");

        int count = 0;

        while(true) {

            System.out.println("사원의 이름을 입력하세요");
            String name = sc.next();

            System.out.println("사원의 나이를 입력하세요");
            int age = sc.nextInt();

            System.out.println("사원의 키를 입력하세요");
            double heght = sc.nextDouble();

            System.out.println("사원의 몸무게를 입력하세요");
            double weght = sc.nextDouble();

            System.out.println("사원의 급여를 입력하세요");
            int salary = sc.nextInt();

            System.out.println("사원의 부서를 입력하세요");
            String dept = sc.next();


            eDTO[count] = new EmployeeDTO(name, age, heght, weght, salary, dept);
            count++;

            System.out.println(Arrays.toString(eDTO));


            if (count == 2) {

                break;
            }




        }

        System.out.println(Arrays.toString(eDTO));









        // 객체 배열에 저장된 값을 전부 보여주는 거...?
        //


        // System.out.println();
        // System.out.println("=======================================");

        // 2명 정도의 사원 정보를 입력받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력

        System.out.println("집에서 꼬옥 하렴...하고 이걸 지우렴...");






    }

}
