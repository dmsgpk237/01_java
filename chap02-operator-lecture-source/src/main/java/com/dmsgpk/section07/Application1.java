package com.dmsgpk.section07;

public class Application1 {
    public static void main(String[] args) {


        /*
        [산술 연산자]

        1. 변수 `a`가 15이고, `b`가 4일 때, `a / b`의 결과를 구하세요.
        2. 두 수 8과 3에 대해 나머지 연산을 수행하는 코드를 작성하세요.
        3. `5 * 2 - 3`을 계산하고 결과를 출력하는 코드를 작성하세요.
        */

        //1번
        System.out.println("===== 산술 연산자 =====");

        int a = 15;
        int b = 4;
        System.out.println("a와 b의 / 연산 결과 : " + (a / b));
        System.out.println();

        //2번
        System.out.println("8과 3의 나머지 연산 결과 : " + (8 % 3));
        System.out.println();

        //3번
        System.out.println("5 * 2 -3을 계산하고 결과를 출력하는 코드 : " + "(5 * 2 - 3) = " + (5 * 2 -3));
        System.out.println();


        /*
        [복합 대입 연산자]

        1. 변수 **`x`**가 10일 때, **`x += 5`**의 결과는 얼마인가요?
        2. 변수 **`y`**가 20일 때, **`y /= 4`**의 결과를 구하세요.
        3. 변수 **`z`**가 8이고, **`z %= 3`**을 수행한 후의 **`z`**의 값을 구하세요.
        */

        //1번
        System.out.println("===== 복합 대입 연산자 =====");
        int x = 5;

        System.out.println("변수 x의 += 5 결과는? : " + (x += 5)); // x = x + 10
        System.out.println();

        //2번
        int y = 20;
        System.out.println("변수 y의 /= 4 결과는? : " + (y /= 4)); // y = y/4
        System.out.println();

        //3번
        int z = 8;
        System.out.println("변수 z의 %= 3 결과는? : " + (z %= 3)); // z = z%3
        System.out.println(("변수 z의 값은? : ") + z);
        System.out.println();

        /*
        [증감 연산자]

        1. 변수 **`i`**가 0일 때, **`i++`** 후의 **`i`**의 값을 출력하세요.
        2. **`int j = 10;`** 선언 후 **`--j`**의 결과를 출력하세요.
        3. **`int k = 5;`** 선언 후 **`k`** 값을 증가시키고, 증가된 값을 출력하는 코드를 작성하세요.
        */

        //1번
        System.out.println("===== 증감 연산자 =====");

        int i = 0;
        i++;
        System.out.println("i의 값은? : " + i); // i++ 후위 연산
        System.out.println();

        //2번
        int j = 10;
        --j;
        System.out.println("j의 값은? : " + j); // --j 전위 연산
        System.out.println();

        //3번
        int k = 5;
        System.out.println("k가 5일때, 증가된 k의 값은? : " + "++k = " + ++k);
        System.out.println();


        /*
        [비교 연산자]

        1. 두 변수 **`num1 = 10`**, **`num2 = 20`**이 같은지 비교하는 코드를 작성하세요.
        2. **`15`**가 **`10`**보다 큰지 확인하는 Java 코드를 작성하세요.
        3. 변수 **`age`**가 18 이상인지 확인하는 조건문을 작성하세요.
        */

        //1번
        System.out.println("===== 비교 연산자 =====");
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1과 num2는 같은가요? : " + (num1 == num2));
        System.out.println();


        //2번
        System.out.println("15가 10보다 큰가요? : " + (15 > 10));
        System.out.println("15가 10보다 작은가요? : " + (15 < 10));
        System.out.println();

        //3번
        int age = 26;
        System.out.println("변수 age는 18 이상인가요? : " + (age >= 18));
        System.out.println("변수 age는 18 이하인가요? : " + (age <= 18));
        System.out.println();


        /*
        [논리 연산자]

        1. 변수 **`a = true`**, **`b = false`**일 때, 둘 다 참이어야 참을 반환하는 조건문을 작성하세요.
        2. **`int age = 20;`**이 18 이상이면서 65 미만인지 확인하는 코드를 작성하세요.
        3. 변수 **`x = 10`**, **`y = 20`**일 때, **`x`**가 10이 아니거나 **`y`**가 25 이상인지 확인하는 코드를 작성하세요.
        */

        //1번
        System.out.println("===== 논리 연산자 =====");
        boolean a1 = true;
        boolean b2 = false;
        System.out.println("a와 b가 둘 다 참일 때 참을 반환하는 조건문을 작성하세요 : a1 && !b2 = " + (a1 && !b2));
        System.out.println();

        //2번
        int age1 = 20;
        System.out.println("변수 age가 18 이상이면서 65 미만입니까? : age >= 18 && age <= 65) = " + (age >= 18 && age <= 65));
        System.out.println();

        //3번
        int x1 = 10;
        int y2 = 20;
        System.out.println("변수 x1가 10이 아니거나, y2가 25 이상입니까? : (x1 != 10 || y2 >= 25) = " + (x1 != 10 || y2 >= 25));
        System.out.println();

    }
}
