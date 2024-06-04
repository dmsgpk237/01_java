package com.dmsgpk.lamda.test;

import java.time.LocalTime;
import java.util.*;
import java.util.function.*;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    /*
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     * </pre>
     */

    private void test1() {
        Consumer<LocalTime> consumer = time -> System.out.println("현재 시각은 : " + time);
        consumer.accept(LocalTime.now());
    }

    /*
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer> //Supplier
     * </pre>
     */

    private void test2() {

        // 랜덤 난수를 발생시킨다.
        // 이걸 6개를 발생시킨다. 이건 반복문으로 넣어준다.
        // 발생시킨 랜덤 난수 중 같은 수가 나오지 않도록 ListSet으로 묶어준다.
        // 묶은 List를 출력한다.
        // set에는 중복된 숫자가 저장이 안 됨, 그러니까 while문을 써서 6보다 커지면 빠져나오게 하고
        // 그 전에는 랜덤 숫자를 hashSet.add로 넣을 수 있게 하면 됨!!



        // supplier<이 안에 들어가는 것은 리턴 값입니다요. 서플라이어만>
        Supplier<Set<Integer>> supplier = () -> {
            HashSet<Integer> hashSet = new HashSet<>(6);

            while(true) {

                hashSet.add((int) (Math.random() * 45) + 1);


                if (hashSet.size() == 6) {

                    break;
                }

                //
            }
            return hashSet;
        };
        Set<Integer> set = supplier.get();
        System.out.println(set);


        ObjIntConsumer<java.util.Random> objIntConsumer =
                ((random, value) -> System.out.println("당신의 당첨 번호는 : " +
                        "(" + random.nextInt(value +1) + "), (" + random.nextInt(value +1) + "), ("
                + random.nextInt(value +1) + "), (" + random.nextInt(value +1) + "), (" + random.nextInt(value +1) + "), ("
                + random.nextInt(value +1) + ") 입니다!"));
        objIntConsumer.accept(new java.util.Random(), 45);

    }

    /*
     * <pre>
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.
     * </pre>
     */

    private void test3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하세요 : ");
        int price = sc.nextInt();

        DoubleSupplier doubleSupplier = () -> (double) price;
        String result = String.format("%.2f", (doubleSupplier.getAsDouble() / 1350));
        System.out.println("입력하신 ￦" + price + "을 환율한 달러 값은 : $" + result + " 입니다.");

        // 원화를 입력받는다.
        // 입력받은 원화를 환율 계산기를 통해 달러로 바꿔준다.
        // 달러로 얼마인지 출력해준다. (1달러는 1,350원이다) >> 입력받은 원 / 1350

        /*
        double num = 111.12345;
		// 소수점 둘째자리 까지
		String result6 = String.format("%.2f", num);
		System.out.println(result6);
        * */

    }

    /*
     * <pre>
     * @실습문제4
     * 3번 문제를 jdk가 제공하는 Function 함수형 인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */

    private void test4() {
        Scanner sc = new Scanner(System.in);

        Function<String, Integer> function = (string) -> Integer.parseInt(string);
        System.out.println("금액을 입력하세요 : ");
        String string = sc.nextLine();
        String price = String.format("%.2f", ((double) function.apply(string) / 1350));
        System.out.println("입력하신 ￦" + string + "을 환율한 달러 값은 : $" + price + " 입니다.");

        //Function<>
        // 펑션을 사용할게욥
        // 달러로 바꾸고 싶은 금액을 문자열로 입력하세요
        // 문자열로 받은 금액을 인트형으로 바꿔주세요
        // 인트형으로 받은 금액을 달러로 바꿔주세욥
        // 바꾼 달러를 출력해주세욥.
    }

    /*
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
     * </pre>
     */

    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");

        /*
         * ArrayList
         * -> 배열의 단점을 보완하기 위해 만들어졌다.
         * 배열의 단점 : 크기 변경 불가, 요소의 추가, 수정, 삭제, 졍렬이 복잡함.
         * 크기 변경(더 큰 배열을 새롭게 만들어 옮기기), 요소의 추가, 수정, 삭제, 정렬 기능을
         * 미리 메서드로 구현해서 제공한다.
         * */

        // chap12-section01-Application1 확인

        Predicate<String> isNonEmptyString = str -> str.trim().length() != 0;

        for (String str : strList) {
            System.out.println("String: " + str + ", Is Non-empty: " + isNonEmptyString.test(str));
        }

        // 아래 지정된 문자열이 있음.
        // 지정된 문자열의 길이가 0인지 체크한다.
        // 지정된 문자열이 0이면 true, 0이 아니면 false를 반환한다.

    }
}
